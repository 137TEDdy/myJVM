package ted.jvm.instruction.stores;

import ted.jvm.instruction.Instruction;
import ted.jvm.rtda.BasicTypeArray;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class LASTORE extends Instruction {

    public LASTORE(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        long val = frame.popLong();
        int index = frame.popInt();
        final BasicTypeArray array = (BasicTypeArray) frame.popRef();
        array.longs[index] = val;
    }

}
