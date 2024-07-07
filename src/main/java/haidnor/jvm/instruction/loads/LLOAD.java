package ted.jvm.instruction.loads;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.bcel.Const;


public class LLOAD extends Instruction {

    private final int index;

    public LLOAD(CodeStream codeStream) {
        super(codeStream);
        this.index = codeStream.readUnsignedByte(this);
    }

    @Override
    public void execute(Frame frame) {
        long value = frame.slotGetLong(index);
        frame.push(new StackValue(Const.T_LONG, value));
    }

}
