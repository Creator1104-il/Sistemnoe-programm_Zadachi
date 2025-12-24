import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestUmno {
    @Test
    public void test1(){
        int result = Main.method1(3, 5);
        assertEquals(15, result);
    }
    @Test
    public void test2(){
        int result = Main.method2(3, 5);
        assertEquals(15, result);
    }
    @Test
    public void test3(){
        int result = Main.method3(3, 5);
        assertEquals(15, result);
    }
    @Test
    public void test4(){
        int result = Main.method4(3, 5);
        assertEquals(15, result);
    }
    @Test
    public void test5(){
        int result = Main.method5(3, 5);
        assertEquals(15, result);
    }
}
