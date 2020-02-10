import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculationTest {
    
    public CalculationTest() {
    }
    
    /**
     * Test of add method, of class Calculation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int number1 = 50;
        int number2 = 50;
        Calculation instance = new Calculation();
        int expResult = 100;
        int result = instance.add(number1, number2);
        assertEquals(expResult, result);
        System.out.println(number1 +"+" +number2+ "=" +result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class Calculation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int number1 = 50;
        int number2 = 50;
        Calculation instance = new Calculation();
        int expResult = 0;
        int result = instance.subtract(number1, number2);
        assertEquals(expResult, result);
        System.out.println(number1 +"-" +number2+ "=" +result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int number1 = 50;
        int number2 = 50;
        Calculation instance = new Calculation();
        int expResult = 2500;
        int result = instance.multiply(number1, number2);
        assertEquals(expResult, result);
        System.out.println(number1 +"*" +number2+ "=" +result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculation.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int number1 = 50;
        int number2 = 50;
        Calculation instance = new Calculation();
        double expResult = 1.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0.0);
        System.out.println(number1 +"/" +number2+ "=" +result );
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
