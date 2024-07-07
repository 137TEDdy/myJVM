package ted.jvm.instruction.control;

import ted.jvm.runtime.Frame;
import ted.jvm.core.CodeStream;
import ted.jvm.core.JVMThreadHolder;

public class RETURN extends ReturnableInstruction {

    public RETURN(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        JVMThreadHolder.get().pop();
    }

}
