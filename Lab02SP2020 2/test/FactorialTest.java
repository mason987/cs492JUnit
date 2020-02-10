import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    int n=-3;
    public FactorialTest() {
        int n=-3;
    }
    
    /**
     * Test of factorial method, of class Factorial.
     */
    @Test (expected=IllegalArgumentException.class)
    public void testFactorial() {
        System.out.println("factorial");
        //int n = 0;
        Factorial instance = new Factorial();
        int expResult = 0;
        int result = instance.factorial(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
