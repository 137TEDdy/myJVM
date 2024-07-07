package ted.jvm.test;

import ted.jvm.tedJVM;
import ted.jvm.test.demo.*;
import ted.jvm.test.instruction.Array;
import ted.jvm.test.instruction.DO_WHILE;
import ted.jvm.test.instruction.math.ISUB;
import ted.jvm.test.instruction.math.LSUB;
import ted.jvm.test.instruction.references.NEW;
import org.junit.Test;

public class TestJVM {


    /**
     * hello,world
     */
    @Test
    public void test_1() throws Exception {
        tedJVM.testRun(demo_helloWorld.class);
    }

    @Test
    public void test_2() throws Exception {
        tedJVM.testRun(Demo2.class);
    }

    @Test
    public void test_3() throws Exception {
        tedJVM.testRun(Demo3.class);
    }

    @Test
    public void test_4() throws Exception {
        tedJVM.testRun(Demo4.class);
    }

    @Test
    public void test_5() throws Exception {
        tedJVM.testRun(Demo5.class);
    }

    @Test
    public void test_6() throws Exception {
        tedJVM.testRun(Demo6.class);
    }

    @Test
    public void test_7() throws Exception {
        tedJVM.testRun(Demo7.class);
    }

    @Test
    public void test_8() throws Exception {
        tedJVM.testRun(Demo8.class);
    }

    @Test
    public void demo_while() throws Exception {
        tedJVM.testRun(demo_while.class);
    }

    @Test
    public void demo_doWhile() throws Exception {
        tedJVM.testRun(demo_doWhile.class);
    }

    @Test
    public void demo_for() throws Exception {
        tedJVM.testRun(demo_for.class);
    }

    @Test
    public void demo_foreach() throws Exception {
        tedJVM.testRun(demo_foreach_1.class);
    }

    /**
     * --add-opens java.base/java.util=ALL-UNNAMED
     */
    @Test
    public void demo_foreach_2() throws Exception {
        // runMainClass(demo_foreach_2.class);
    }

    /**
     * --add-opens java.base/java.util=ALL-UNNAMED
     */
    @Test
    public void demo_foreach_3() throws Exception {
        // TODO wangxiang fix bug
        // runMainClass(demo_foreach_3.class);
    }

    @Test(expected = ArithmeticException.class)
    public void demo_exception_1() throws Exception {
        tedJVM.testRun(demo_exception_1.class);
    }

    @Test
    public void demo_exception_2() throws Exception {
        tedJVM.testRun(demo_exception_2.class);
    }

    @Test
    public void demo_exception_3() throws Exception {
        tedJVM.testRun(demo_exception_3.class);
    }

    @Test(expected = ArithmeticException.class)
    public void demo_exception_4() throws Exception {
        tedJVM.testRun(demo_exception_4.class);
    }

    @Test
    public void demo_finally_1() throws Exception {
        tedJVM.testRun(demo_finally_1.class);
    }

    @Test(expected = ArithmeticException.class)
    public void demo_finally_2() throws Exception {
        tedJVM.testRun(demo_finally_2.class);
    }

    @Test(expected = ArithmeticException.class)
    public void demo_finally_3() throws Exception {
        tedJVM.testRun(demo_finally_3.class);
    }
    
    
    @Test
    public void demo_enum_1() throws Exception {
        // TODO support enum
        // runMainClass(demo_enum_1.class);
    }

    @Test
    public void test_NEW() throws Exception {
        tedJVM.testRun(NEW.class);
    }

    @Test
    public void test_ISUB() throws Exception {
        tedJVM.testRun(ISUB.class);
    }

    @Test
    public void test_LSUB() throws Exception {
        tedJVM.testRun(LSUB.class);
    }

    @Test
    public void test_DOWHILE() throws Exception {
        tedJVM.testRun(DO_WHILE.class);
    }

    @Test
    public void test_Array() throws Exception {
        tedJVM.testRun(Array.class);
    }
    @Test
    public void test_Switch_table() throws Exception {
        tedJVM.testRun(demo_switch_table.class);
    }
    @Test
    public void test_Switch_lookup() throws Exception {
        tedJVM.testRun(demo_switch_lookup.class);
    }

    @Test
    public void test_() throws Exception {
        long longNum = 922337203685477580L;  // Long Max

        int[] arr = new int[2];
        arr[0] = (int) (longNum >> 32); // 获取高位部分
        arr[1] = (int) (longNum & 0xFFFFFFFFL); // 获取低位部分

        long result = ((long) arr[0] << 32) | ((long) arr[1] & 0xFFFFFFFFL);
        System.out.println(result);
    }
}
