package ted.jvm.instruction.math;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class ISHL extends Instruction {

    public ISHL(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        int v2 = frame.popInt();
        int v1 = frame.popInt();
        int s = v2 & 0x1f;
        int ret = v1 << s;
        frame.pushInt(ret);
    }

}
