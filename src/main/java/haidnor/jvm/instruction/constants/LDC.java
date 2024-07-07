package ted.jvm.instruction.constants;

import ted.jvm.bcel.Const;
import ted.jvm.bcel.classfile.*;
import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import lombok.SneakyThrows;

/**
 * Java VM opcode.
 *
 * @see <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-6.html#jvms-6.5.ldc"> Opcode definitions in The
 *      Java Virtual Machine Specification</a>
 */
public class LDC extends Instruction {

    private final int constantIndex;

    public LDC(CodeStream codeStream) {
        super(codeStream);
        this.constantIndex = codeStream.readUnsignedByte(this);
    }

    @Override
    @SneakyThrows
    public void execute(Frame frame) {
        ConstantPool constantPool = frame.getJavaMethod().getConstantPool();

        // 从常量池中获取值
        Constant constant = constantPool.getConstant(constantIndex);

        switch (constant.getTag()) {
            case Const.CONSTANT_Integer: {
                ConstantInteger constantInteger = (ConstantInteger) constant;
                Object value = constantInteger.getConstantValue(constantPool);
                frame.push(new StackValue(Const.T_INT, value));
                break;
            }
            case Const.CONSTANT_Float: {
                ConstantFloat constantFloat = (ConstantFloat) constant;
                Object value = constantFloat.getConstantValue(constantPool);
                frame.push(new StackValue(Const.T_FLOAT, value));
                break;
            }
            case Const.CONSTANT_String: {
                ConstantString constString = (ConstantString) constant;
                Object value = constString.getConstantValue(constantPool);
                frame.push(new StackValue(Const.T_OBJECT, value));
                break;
            }
            default:
                throw new Error("not supported LDC type" + constant.getTag());
        }
    }

}
