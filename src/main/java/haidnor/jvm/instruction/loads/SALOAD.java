package ted.jvm.instruction.loads;

import ted.jvm.instruction.Instruction;
import ted.jvm.rtda.BasicTypeArray;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;


public class SALOAD extends Instruction {

    public SALOAD(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        int index = frame.popInt();
        BasicTypeArray array = (BasicTypeArray) frame.popRef();
        frame.pushInt(array.ints[index]);
    }

}
