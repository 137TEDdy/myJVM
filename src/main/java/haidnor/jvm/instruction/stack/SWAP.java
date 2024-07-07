package ted.jvm.instruction.stack;

import ted.jvm.instruction.Instruction;
import ted.jvm.rtda.Instance;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;
import lombok.SneakyThrows;

public class SWAP extends Instruction {

    public SWAP(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    @SneakyThrows
    public void execute(Frame frame) {
        Instance v2 = frame.popRef();
        Instance v1 = frame.popRef();
        frame.pushRef(v2);
        frame.pushRef(v1);
    }

}
