package ted.jvm.instruction.loads;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.bcel.Const;

public class DLOAD_3 extends Instruction {

    public DLOAD_3(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        double value = frame.slotGetDouble(3);
        frame.push(new StackValue(Const.T_DOUBLE, value));
    }

}
