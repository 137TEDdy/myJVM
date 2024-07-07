package ted.jvm.instruction.stores;

import ted.jvm.instruction.Instruction;
import ted.jvm.rtda.Instance;
import ted.jvm.rtda.InstanceArray;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class AASTORE extends Instruction {

    public AASTORE(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        Instance val = frame.popRef();
        int index = frame.popInt();
        InstanceArray array = (InstanceArray) frame.popRef();
        array.items[index] = val;
    }

}
