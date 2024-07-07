package ted.jvm.instruction.conversions;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class I2S extends Instruction {

    public I2S(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        int intVal = frame.popInt();
        short shortValue = Integer.valueOf(intVal).shortValue();
        frame.pushInt(((int) shortValue));
    }

}
