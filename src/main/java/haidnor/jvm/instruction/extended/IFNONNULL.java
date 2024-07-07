package ted.jvm.instruction.extended;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;

public class IFNONNULL extends Instruction {
    /**
     * 下次再执行的偏移量
     */
    private final int offSet;

    public IFNONNULL(CodeStream codeStream) {
        super(codeStream);
        this.offSet = codeStream.readShort(this);
    }

    @Override
    public void execute(Frame frame) {
        StackValue v1 = frame.pop();
        if (v1.getValue() != null) {
            super.setOffSet(offSet);
        } else {
            super.setOffSet(3);
        }
    }

    @Override
    public String toString() {
        return super.getIndex() + " " + this.getClass().getSimpleName() + " "  + offSet;
    }
}
