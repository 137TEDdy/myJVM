package ted.jvm.instruction.conversions;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class F2I extends Instruction {

    public F2I(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        float floatVal = frame.popFloat();
        frame.pushInt(Float.valueOf(floatVal).intValue());
    }

}
