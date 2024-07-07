package ted.jvm.instruction.control;

import ted.jvm.instruction.Instruction;
import ted.jvm.core.CodeStream;

/**
 * return 系列字节码指令的抽象类
 */
public abstract class ReturnableInstruction extends Instruction {

    public ReturnableInstruction(CodeStream codeStream) {
        super(codeStream);
    }

}
