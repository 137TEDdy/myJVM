package ted.jvm.instruction.loads;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.bcel.Const;

public class ALOAD_1 extends Instruction {

    public ALOAD_1(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        Object value = frame.slotGetRef(1);
        frame.push(new StackValue(Const.T_OBJECT, value));
    }

}
