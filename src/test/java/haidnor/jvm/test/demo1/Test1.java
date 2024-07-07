package ted.jvm.test.demo1;

import ted.jvm.tedJVM;

public class Test1 {
    public static void main(String[] args) {
        tedJVM.testRun(TestClass.class);
    }

}

/**
 * 0 getstatic #7 <java/lang/System.out : Ljava/io/PrintStream;>
 * 3 ldc #13 <hello,world>
 * 5 invokevirtual #15 <java/io/PrintStream.println : (Ljava/lang/String;)V>
 * 8 return
 */
class TestClass {
    public static void main(String[] args) {
        System.out.println("hello,world");
    }
}