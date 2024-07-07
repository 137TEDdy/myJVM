
package ted.jvm.instruction.references;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;
import lombok.SneakyThrows;

public class CHECKCAST extends Instruction {

    private final int constantClassIndex;

    public CHECKCAST(CodeStream codeStream) {
        super(codeStream);
        this.constantClassIndex = codeStream.readUnsignedShort(this);
    }

    @Override
    @SneakyThrows
    public void execute(Frame frame) {
        // 暂时不支持
    }

}
