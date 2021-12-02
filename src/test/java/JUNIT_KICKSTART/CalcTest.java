package JUNIT_KICKSTART;

import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calc calc = new Calc();

    @Test
    public  void  additionTest(){
        assertEquals(4, calc.Addition(2, 2));
    }
}
