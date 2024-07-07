package ted.jvm.instruction.conversions;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class D2L extends Instruction {

    public D2L(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        double doubleVal = frame.popDouble();
        frame.pushLong(Double.valueOf(doubleVal).longValue());
    }

}
