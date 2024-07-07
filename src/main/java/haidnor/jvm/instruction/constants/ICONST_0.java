package ted.jvm.instruction.constants;

import ted.jvm.instruction.Instruction;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.bcel.Const;

/**
 * https://docs.oracle.com/javase/specs/jvms/se19/html/jvms-6.html#jvms-6.5.iconst_i
 */
public class ICONST_0 extends Instruction {

    public ICONST_0(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        frame.push(new StackValue(Const.T_INT, 0));
    }

}
