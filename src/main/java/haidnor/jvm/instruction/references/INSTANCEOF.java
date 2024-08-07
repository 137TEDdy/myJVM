package ted.jvm.instruction.references;

import ted.jvm.bcel.Const;
import ted.jvm.bcel.classfile.ConstantClass;
import ted.jvm.bcel.classfile.JavaClass;
import ted.jvm.bcel.classfile.Utility;
import ted.jvm.instruction.Instruction;
import ted.jvm.rtda.Instance;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;
import lombok.SneakyThrows;

/**
 * @author wang xiang
 */
public class INSTANCEOF extends Instruction {

    private final int constantClassIndex;

    public INSTANCEOF(CodeStream codeStream) {
        super(codeStream);
        this.constantClassIndex = codeStream.readUnsignedShort(this);
    }

    @Override
    @SneakyThrows
    public void execute(Frame frame) {
        ConstantClass constantClass = frame.getJavaMethod().getConstantPool().getConstant(constantClassIndex);
        String className = constantClass.getClassName();
        className = Utility.compactClassName(className);

        StackValue stackValue = frame.pop();
        Object obj = stackValue.getValue();
        Class<?> objClass = obj.getClass();

        if (obj instanceof Instance instance) {
            boolean result = findClassFromSuper(instance.getJavaClass(), className);
            if (!result)  {
                result = findClassFromInterface(instance.getJavaClass(), className);
            }
            if (result) {
                frame.push(new StackValue(Const.T_INT, 1));
            } else {
                frame.push(new StackValue(Const.T_INT, 0));
            }
        } else {
            if (Class.forName(className).isAssignableFrom(objClass)) {
                frame.push(new StackValue(Const.T_INT, 1));
            } else {
                frame.push(new StackValue(Const.T_INT, 0));
            }
        }
    }

    public boolean findClassFromSuper(JavaClass javaClass, String className) throws ClassNotFoundException {
        if (javaClass.getClassName().equals(className)) {
            return true;
        }
        for (JavaClass superClass : javaClass.getSuperClasses()) {
            if (superClass.getClassName().equals(className)) {
                return true;
            }
        }
        return false;
    }

    public boolean findClassFromInterface(JavaClass javaClass, String className) throws ClassNotFoundException {
        for (JavaClass anInterface : javaClass.getInterfaces()) {
            if (anInterface.getClassName().equals(className)) {
                return true;
            }
        }
        return false;
    }

}
