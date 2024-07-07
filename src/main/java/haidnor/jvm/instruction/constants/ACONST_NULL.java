package ted.jvm.instruction.constants;

import ted.jvm.bcel.Const;
import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;

public class ACONST_NULL extends Instruction {

    public ACONST_NULL(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        frame.push(new StackValue(Const.T_OBJECT, null));
    }

}
