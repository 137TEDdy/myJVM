package ted.jvm.rtda;

import ted.jvm.bcel.classfile.JavaClass;

public class InstanceArray extends ArrayInstance {

    public final Instance[] items;

    public InstanceArray(JavaClass javaClass, Instance[] items) {
        super(javaClass, items.length);
        this.items = items;
    }

}