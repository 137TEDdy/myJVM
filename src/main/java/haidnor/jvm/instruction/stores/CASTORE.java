package ted.jvm.instruction.stores;

import ted.jvm.instruction.Instruction;
import ted.jvm.rtda.BasicTypeArray;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class CASTORE extends Instruction {

    public CASTORE(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        int val = frame.popInt();
        int index = frame.popInt();
        BasicTypeArray array = (BasicTypeArray) frame.popRef();
        array.ints[index] = val;
    }

}
