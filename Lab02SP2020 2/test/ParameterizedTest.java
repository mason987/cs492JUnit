import org.junit.AfterClass;
import org.junit.BeforeClass;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;
import org.junit.Before;


@RunWith(Parameterized.class)
public class ParameterizedTest {
   
    private int result;
    private int value;
    Factorial factoring;
   
    @Before
    public void setup(){
        factoring = new Factorial();
    }
    public ParameterizedTest(int result, int value){
        this.result = result;
        this.value = value;
    }
    
    @Parameters
    public static Collection<Object[]> testInput(){
        
        Object[][] input = new Object[][]{{6,3}, {2,2}, {120,5}, {24,4}};
               return Arrays.asList(input);
        }
    @Test
    public void testFactorial(){
        System.out.println("The factorial of " + value + " is  "+ result);
        assertEquals(result, factoring.factorial(value));
    }
        }