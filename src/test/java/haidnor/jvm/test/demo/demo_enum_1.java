package ted.jvm.test.demo;

import ted.jvm.test.clazz.StudentEnum;

public class demo_enum_1 {
    public static void main(String[] args) {
        StudentEnum studentEnum = StudentEnum.ZHANG_SAN;
        System.out.println(studentEnum.getAge());
        System.out.println(studentEnum.getName());
    }
}
