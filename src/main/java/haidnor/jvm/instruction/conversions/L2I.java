package ted.jvm.instruction.conversions;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class L2I extends Instruction {

    public L2I(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        long longVal = frame.popLong();
        frame.pushInt(Long.valueOf(longVal).intValue());
    }

}
