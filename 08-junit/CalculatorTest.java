package put.io.testing.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    @Test
    public void  testadd(){

        assertEquals(7, calculator.add(5, 2) );
        assertEquals(-22, calculator.add(-12, -10) );
        assertEquals(-3, calculator.add(-2, -1) );
        assertEquals(0, calculator.add(0, 0) );
    }
    @Test
    public void  testmultiply(){

        assertEquals(-100, calculator.multiply(10, -10) );
        assertEquals(52, calculator.multiply(26, 2) );
        assertEquals(0, calculator.multiply(0, 0) );
        assertEquals(15, calculator.multiply(-3, -5) );
        assertEquals(2, calculator.multiply(2, 1) );
    }
    @Test
    public void  testaddpositivenumbers(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            assertEquals(50, calculator.addPositiveNumbers(-50, 60) );
        });


    }
    @BeforeEach
    public void setUp(){
        calculator=new Calculator();
    }
//tak przestalyby dzialac gdyz program tworzylby nowy calculator tylko raz

}