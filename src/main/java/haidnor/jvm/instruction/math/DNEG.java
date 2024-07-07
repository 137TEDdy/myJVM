package ted.jvm.instruction.math;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.bcel.Const;

public class DNEG extends Instruction {

    public DNEG(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        StackValue stackValue = frame.pop();
        double value = (double) stackValue.getValue();
        double tmp = -value;
        frame.push(new StackValue(Const.T_DOUBLE, tmp));
    }

}
