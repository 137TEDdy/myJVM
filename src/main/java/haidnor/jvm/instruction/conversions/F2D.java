package ted.jvm.instruction.conversions;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class F2D extends Instruction {

    public F2D(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        float floatVal = frame.popFloat();
        frame.pushDouble(Float.valueOf(floatVal).doubleValue());
    }

}
