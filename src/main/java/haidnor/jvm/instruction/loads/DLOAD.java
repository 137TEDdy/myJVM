package ted.jvm.instruction.loads;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.bcel.Const;


public class DLOAD extends Instruction {

    private final int index;

    public DLOAD(CodeStream codeStream) {
        super(codeStream);
        this.index = codeStream.readUnsignedByte(this);
    }

    @Override
    public void execute(Frame frame) {
        double value = frame.slotGetDouble(index);
        frame.push(new StackValue(Const.T_DOUBLE, value));
    }

}
