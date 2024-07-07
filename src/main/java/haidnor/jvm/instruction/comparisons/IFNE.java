package ted.jvm.instruction.comparisons;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;

public class IFNE extends Instruction {
    /**
     * 下次再执行的偏移量
     */
    private final int offSet;

    public IFNE(CodeStream codeStream) {
        super(codeStream);
        this.offSet = codeStream.readShort(this);
    }

    @Override
    public void execute(Frame frame) {
        StackValue v1 = frame.pop();
        if (v1.getValue() instanceof Boolean) {
            if (((boolean) v1.getValue())) {
                super.setOffSet(offSet);
            } else {
                super.setOffSet(3);
            }
        } else {
            if ((int) v1.getValue() != 0) {
                super.setOffSet(offSet);
            } else {
                super.setOffSet(3);
            }
        }

    }

    @Override
    public String toString() {
        return super.getIndex() + " " + this.getClass().getSimpleName() + " "  + offSet;
    }

}
