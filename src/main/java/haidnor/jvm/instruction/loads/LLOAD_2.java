package ted.jvm.instruction.loads;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.bcel.Const;

public class LLOAD_2 extends Instruction {

    public LLOAD_2(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        long value = frame.slotGetLong(2);
        frame.push(new StackValue(Const.T_LONG, value));
    }

}
