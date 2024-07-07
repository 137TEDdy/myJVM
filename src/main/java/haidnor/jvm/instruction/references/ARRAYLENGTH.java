package ted.jvm.instruction.references;

import ted.jvm.instruction.Instruction;
import ted.jvm.rtda.ArrayInstance;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;
import lombok.SneakyThrows;

public class ARRAYLENGTH extends Instruction {

    public ARRAYLENGTH(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    @SneakyThrows
    public void execute(Frame frame) {
        ArrayInstance array = (ArrayInstance) frame.popRef();
        frame.pushInt(array.size);
    }

}
