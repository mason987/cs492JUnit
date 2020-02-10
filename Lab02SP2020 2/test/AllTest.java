import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
        


@RunWith(Suite.class)
@Suite.SuiteClasses({CalculationTest.class, ParameterizedTest.class, FactorialTest.class})
public class AllTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
