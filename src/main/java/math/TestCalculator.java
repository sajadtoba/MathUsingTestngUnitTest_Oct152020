package math;
import org.testng.Assert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int ActualResult = cal.getAdditionValue(12,30);
        System.out.println(ActualResult);
        Assert.assertEquals(40,ActualResult);




    }

}
