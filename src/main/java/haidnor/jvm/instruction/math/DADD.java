package ted.jvm.instruction.math;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.bcel.Const;

public class DADD extends Instruction {

    public DADD(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        StackValue value2 = frame.pop();
        StackValue value1 = frame.pop();
        double result = (double) value1.getValue() + (double) value2.getValue();
        frame.push(new StackValue(Const.T_DOUBLE, result));
    }

}
