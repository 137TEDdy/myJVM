package ted.jvm.instruction.math;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.bcel.Const;

public class FMUL extends Instruction {

    public FMUL(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        StackValue value2 = frame.pop();
        StackValue value1 = frame.pop();
        float result = (float) value1.getValue() * (float) value2.getValue();
        frame.push(new StackValue(Const.T_FLOAT, result));
    }

}
