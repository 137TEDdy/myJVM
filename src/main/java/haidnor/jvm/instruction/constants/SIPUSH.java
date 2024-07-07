package ted.jvm.instruction.constants;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.bcel.Const;

/**
 * Java VM opcode.
 *
 * @see <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-6.html#jvms-6.5.sipush"> Opcode definitions in
 *      The Java Virtual Machine Specification</a>
 */
public class SIPUSH extends Instruction {

    private final int value;

    public SIPUSH(CodeStream codeStream) {
        super(codeStream);
        this.value = codeStream.readShort(this);
    }

    @Override
    public void execute(Frame frame) {
        frame.push(new StackValue(Const.T_INT, value));
    }

}
