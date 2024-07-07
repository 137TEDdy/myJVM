package ted.jvm.instruction.comparisons;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

/**
 * @author wang xiang
 */
public class DCMPG extends Instruction {

    public DCMPG(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        double v2 = frame.popDouble();
        double v1 = frame.popDouble();
        if (v1 == v2) {
            frame.pushInt(0);
            return;
        }
        if (v1 < v2) {
            frame.pushInt(-1);
            return;
        }
        frame.pushInt(1);
    }

}
