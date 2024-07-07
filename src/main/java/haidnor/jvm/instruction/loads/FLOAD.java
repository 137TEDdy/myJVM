package ted.jvm.instruction.loads;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.bcel.Const;


public class FLOAD extends Instruction {

    private final int index;

    public FLOAD(CodeStream codeStream) {
        super(codeStream);
        this.index = codeStream.readUnsignedByte(this);
    }

    @Override
    public void execute(Frame frame) {
        float value = frame.slotGetFloat(index);
        frame.push(new StackValue(Const.T_FLOAT, value));
    }

}
