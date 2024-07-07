package ted.jvm.instruction.math;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class LSHR extends Instruction {

    public LSHR(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        final int v2 = frame.popInt();
        final long v1 = frame.popLong();
        frame.pushLong(v1 >> v2);
    }

}
