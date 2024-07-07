package ted.jvm.instruction.math;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class LOR extends Instruction {

    public LOR(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        Long v2 = frame.popLong();
        Long v1 = frame.popLong();
        frame.pushLong(v1 | v2);
    }

}
