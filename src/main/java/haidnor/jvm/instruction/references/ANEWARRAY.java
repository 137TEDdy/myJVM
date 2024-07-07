package ted.jvm.instruction.references;

import ted.jvm.bcel.Const;
import ted.jvm.bcel.classfile.ConstantClass;
import ted.jvm.bcel.classfile.JavaClass;
import ted.jvm.bcel.classfile.Utility;
import ted.jvm.instruction.Instruction;
import ted.jvm.rtda.Instance;
import ted.jvm.rtda.InstanceArray;
import ted.jvm.rtda.Metaspace;
import ted.jvm.runtime.Frame;
import ted.jvm.runtime.StackValue;
import ted.jvm.core.CodeStream;

public class ANEWARRAY extends Instruction {

    private final int constantClassIndex;

    public ANEWARRAY(CodeStream codeStream) {
        super(codeStream);
        this.constantClassIndex = codeStream.readUnsignedShort(this);
    }

    @Override
    public void execute(Frame frame) {
        ConstantClass constantClass = frame.getJavaMethod().getConstantPool().getConstant(constantClassIndex);
        String className = constantClass.getClassName();

        JavaClass javaClass = Metaspace.getJavaClass(Utility.compactClassName(className));
        if (javaClass == null) {
            // 如果在元空间中找不到已加载的类,则开始进行类加载流程
            javaClass = frame.getJavaClass().getJVMClassLoader().loadWithClassPath(className);
        }
        int size = frame.popInt();
        Instance[] items = new Instance[size];
        InstanceArray instanceArray = new InstanceArray(javaClass, items);

        frame.push(new StackValue(Const.T_OBJECT, instanceArray));
    }

}
