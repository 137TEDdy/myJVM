package ted.jvm.instruction.references;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import lombok.SneakyThrows;

public class ATHROW extends Instruction {

    public ATHROW(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    @SneakyThrows
    public void execute(Frame frame) {
        StackValue pop = frame.pop();
        throw (Exception) pop.getValue();
    }

}
