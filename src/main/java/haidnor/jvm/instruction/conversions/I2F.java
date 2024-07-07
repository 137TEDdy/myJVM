package ted.jvm.instruction.conversions;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

public class I2F extends Instruction {

    public I2F(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        int intVal = frame.popInt();
        frame.pushFloat(Integer.valueOf(intVal).floatValue());
    }

}
