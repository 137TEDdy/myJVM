package ted.jvm.instruction.math;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class LUSHR extends Instruction {

    public LUSHR(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        int v2 = frame.popInt();
        long v1 = frame.popLong();
        int s = v2 & 0x3f;

        if (v1 >= 0) {
            long ret = v1 >> s;
            frame.pushLong(ret);
            return;
        }
        long ret = (v1 >> s) + (2L << ~s);
        frame.pushLong(ret);
    }

}
