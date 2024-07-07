package ted.jvm.instruction.math;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class LXOR extends Instruction {

    public LXOR(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        long v2 = frame.popLong();
        long v1 = frame.popLong();
        frame.pushLong(v1 ^ v2);
    }

}
