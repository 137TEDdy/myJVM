package ted.jvm.instruction.math;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class IAND extends Instruction {

    public IAND(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        Integer v2 = frame.popInt();
        Integer v1 = frame.popInt();
        int val = v1 & v2;
        frame.pushInt(val);
    }

}
