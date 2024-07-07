package ted.jvm.instruction.math;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class LAND extends Instruction {

    public LAND(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        long a1 = frame.popLong();
        long a2 = frame.popLong();
        frame.pushLong(a2 & a1);
    }

}
