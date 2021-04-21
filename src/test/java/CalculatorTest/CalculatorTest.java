import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void multTest() {

        Calculator calculator = new Calculator();
        double actual = calculator.multiple(6,8);
        Assert.assertEquals(actual,48);
    }

    @Test
    public void divTest()
    {
        Calculator calculator=new Calculator();
        double actual=calculator.division(25,5);
         Assert.assertEquals(actual,5);
    }
    @Test

    public void powTest()
    {
        Calculator calculator=new Calculator();
        double actual=calculator.pow(5,3);
        Assert.assertEquals(actual,125);
    }
}