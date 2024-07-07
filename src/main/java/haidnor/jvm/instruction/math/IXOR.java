package ted.jvm.instruction.math;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class IXOR extends Instruction {

    public IXOR(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        final int v2 = frame.popInt();
        final int v1 = frame.popInt();
        frame.pushInt(v1 ^ v2);
    }

}
