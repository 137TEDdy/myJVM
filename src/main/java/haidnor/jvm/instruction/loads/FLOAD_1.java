package ted.jvm.instruction.loads;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.bcel.Const;

public class FLOAD_1 extends Instruction {

    public FLOAD_1(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        float value = frame.slotGetFloat(1);
        frame.push(new StackValue(Const.T_FLOAT, value));
    }

}
