package ted.jvm.instruction.loads;

import ted.jvm.instruction.Instruction;
import ted.jvm.rtda.Instance;
import ted.jvm.rtda.InstanceArray;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;


public class AALOAD extends Instruction {

    public AALOAD(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        int index = frame.popInt();
        InstanceArray array = (InstanceArray) frame.popRef();
        Instance item = array.items[index];
        frame.pushRef(item);
    }

}
