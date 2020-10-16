package math;
import org.testng.Assert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int actualResult = cal.getAdditionValue(12,30);
        System.out.println(actualResult);
//        Assert.assertEquals(40,actualResult);
        int expectedResult = 50;
        System.out.println("Sajad wants to know the expectedResult and actualResult:  "+expectedResult+ "  "+actualResult);
        Assert.assertEquals(actualResult,expectedResult);

    }

}
