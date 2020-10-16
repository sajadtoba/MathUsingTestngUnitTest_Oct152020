package math;

import org.testng.Assert;

public class UnitTestCalculatorPass {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int actualResult = calculator.getAdditionValue(20, 30);
        int expectedResult = 50;
        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("Sheikh wants to know both actual and expected same then tess passed value: "+actualResult+" "+expectedResult);

    }
}