package ted.jvm.instruction.references;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;
import lombok.SneakyThrows;

public class MONITOREXIT extends Instruction {

    public MONITOREXIT(CodeStream codeStream) {
        super(codeStream);
        throw new UnsupportedOperationException("MONITOREXIT");
    }

    @Override
    @SneakyThrows
    public void execute(Frame frame) {
        throw new UnsupportedOperationException("MONITOREXIT");
    }

}
