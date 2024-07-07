package ted.jvm.instruction.references;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;
import lombok.SneakyThrows;

public class MONITORENTER extends Instruction {

    public MONITORENTER(CodeStream codeStream) {
        super(codeStream);
        throw new UnsupportedOperationException("MONITORENTER");
    }

    @Override
    @SneakyThrows
    public void execute(Frame frame) {
        throw new UnsupportedOperationException("MONITORENTER");
    }

}
