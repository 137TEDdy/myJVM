package ted.jvm.instruction.stores;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;

public class FSTORE_0 extends Instruction {

    public FSTORE_0(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        StackValue value = frame.pop();
        frame.slotSetFloat(0, (float) value.getValue());
    }

}
