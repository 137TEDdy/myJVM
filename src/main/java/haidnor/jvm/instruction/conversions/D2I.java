package ted.jvm.instruction.conversions;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class D2I extends Instruction {

    public D2I(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        double doubleVal = frame.popDouble();
        frame.pushInt(Double.valueOf(doubleVal).intValue());
    }

}
