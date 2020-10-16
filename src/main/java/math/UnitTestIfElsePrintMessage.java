package math;

import org.testng.Assert;

public class UnitTestIfElsePrintMessage {

    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        int actualResult = calculator.getAdditionValue(20, 30);
        int expectedResult = 50;
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("Sheikh wants to know both actual and expected same then tess passed value: " + actualResult + " " + expectedResult);

        if (actualResult != expectedResult) {
            System.out.println("The unit test failed and the jvm will not print out the message");
        } else {
            System.out.println("The unit test passed successsfully by using the testng");
        }
    }
}


// The main concern that if the test is failed then jvm does not go to the next code it stopped at the same time
// But if the test passed then it goes to the next line of code to run.







//        if (actualResult == expectedResult) {
//            System.out.println("abc");
//        } else if(actualResult != expectedResult){
//            System.out.println("acd");
//        }else{
//            System.out.println("lov");
//
//        }

// if (actualResult == expectedResult) {
//         System.out.println("abc");
//         } else if (actualResult != expectedResult) {
//         System.out.println("bcd");
//         }