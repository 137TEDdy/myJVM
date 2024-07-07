package ted.jvm.instruction.conversions;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

/**
 * char 类型的数据是以 int 形式存在的,因此不需要做任何处理
 */
public class I2C extends Instruction {

    public I2C(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {

    }

}
