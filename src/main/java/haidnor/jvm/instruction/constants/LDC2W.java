package ted.jvm.instruction.constants;

import ted.jvm.bcel.Const;
import ted.jvm.bcel.classfile.Constant;
import ted.jvm.bcel.classfile.ConstantDouble;
import ted.jvm.bcel.classfile.ConstantLong;
import ted.jvm.bcel.classfile.ConstantPool;
import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;

/**
 * 将 long 或 double 型常量从常量池中推送至栈顶 (宽索引)
 */
public class LDC2W extends Instruction {

    private final byte constantTag;

    private long longValue;

    private double doubleValue;

    public LDC2W(CodeStream codeStream) {
        super(codeStream);
        int index = codeStream.readUnsignedShort(this);
        ConstantPool constantPool = codeStream.getCode().getConstantPool();
        Constant constant = constantPool.getConstant(index);
        this.constantTag = constant.getTag();
        if (constantTag == Const.CONSTANT_Long) {
            ConstantLong constantLong = (ConstantLong) constant;
            this.longValue = constantLong.getBytes();
        } else if (constantTag == Const.CONSTANT_Double) {
            ConstantDouble constantDouble = (ConstantDouble) constant;
            this.doubleValue = constantDouble.getBytes();
        }
    }

    @Override
    public void execute(Frame frame) {
        if (constantTag == Const.CONSTANT_Long) {
            frame.push(new StackValue(Const.T_LONG, this.longValue));
        } else if (constantTag == Const.CONSTANT_Double) {
            frame.push(new StackValue(Const.T_DOUBLE, this.doubleValue));
        }
    }

}
