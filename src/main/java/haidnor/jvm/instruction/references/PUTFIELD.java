package ted.jvm.instruction.references;

import ted.jvm.bcel.classfile.ConstantFieldref;
import ted.jvm.bcel.classfile.JavaField;
import ted.jvm.instruction.Instruction;
import ted.jvm.rtda.Instance;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import lombok.SneakyThrows;

public class PUTFIELD extends Instruction {

    private final int constantFieldrefIndex;

    public PUTFIELD(CodeStream codeStream) {
        super(codeStream);
        this.constantFieldrefIndex = codeStream.readUnsignedShort(this);
    }

    @Override
    @SneakyThrows
    public void execute(Frame frame) {
        ConstantFieldref fieldref = frame.getJavaMethod().getConstantPool().getConstant(constantFieldrefIndex);
        String filedName = fieldref.getName();
        String fieldSignature = fieldref.getSignature();

        StackValue stackValue = frame.pop();

        Instance instance = frame.popRef();
        JavaField field = instance.getField(filedName, fieldSignature);
        field.setValue(stackValue);
    }

}
