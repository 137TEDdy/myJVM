package ted.jvm.test.demo;


import ted.jvm.test.clazz.Human;
import ted.jvm.test.clazz.Student;

public class Demo6 {

    public static void main(String[] args) {
        Student student = new Student();
        if (student instanceof Human) {
            System.out.println("true");
        }
    }

}
