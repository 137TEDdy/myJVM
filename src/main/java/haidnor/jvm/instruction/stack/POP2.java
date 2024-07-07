package ted.jvm.instruction.stack;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;
import lombok.SneakyThrows;

public class POP2 extends Instruction {

    public POP2(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    @SneakyThrows
    public void execute(Frame frame) {
        frame.pop();
    }

}
