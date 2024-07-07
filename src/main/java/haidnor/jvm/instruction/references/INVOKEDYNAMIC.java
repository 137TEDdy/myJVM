package ted.jvm.instruction.references;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;
import lombok.SneakyThrows;

public class INVOKEDYNAMIC extends Instruction {

    public INVOKEDYNAMIC(CodeStream codeStream) {
        super(codeStream);
        throw new UnsupportedOperationException("INVOKEDYNAMIC");
    }

    @Override
    @SneakyThrows
    public void execute(Frame frame) {
        throw new UnsupportedOperationException("INVOKEDYNAMIC");
    }

}
