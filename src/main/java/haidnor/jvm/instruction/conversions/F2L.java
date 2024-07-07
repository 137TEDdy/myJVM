package ted.jvm.instruction.conversions;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class F2L extends Instruction {

    public F2L(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        float floatVal = frame.popFloat();
        frame.pushLong(Float.valueOf(floatVal).longValue());
    }

}
