package ted.jvm.instruction.constants;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;

/**
 * Java VM opcode.
 *
 * @see <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-6.html#jvms-6.5.nop"> Opcode definitions in The
 *      Java Virtual Machine Specification</a>
 */
public class NOP extends Instruction {

    public NOP(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
    }

}
