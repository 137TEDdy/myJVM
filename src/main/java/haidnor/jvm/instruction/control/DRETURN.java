package ted.jvm.instruction.control;

import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import ted.jvm.core.JVMThreadHolder;

public class DRETURN extends ReturnableInstruction {

    public DRETURN(CodeStream codeStream) {
        super(codeStream);
    }

    @Override
    public void execute(Frame frame) {
        // 弹出操作数栈中的值
        StackValue stackValue = frame.pop();
        // 将当前栈帧从 jvm 线程栈中弹出
        JVMThreadHolder.get().pop();
        // 将方法返回值压入前一个栈帧的操作数栈中
        Frame topFrame = JVMThreadHolder.get().peek();
        topFrame.push(stackValue);
    }

}
