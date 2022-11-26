import org.testng.Assert;
import org.testng.annotations.Test;

public class MyCalculatorTest {

    @Test
    void testAddMethod(){
        int firstValue = 20, secondValue = 60;
        int expectedResult = firstValue + secondValue;
        int actualResult = MyCalculator.add(firstValue, secondValue);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    void  testSubstrac(){
        int firstSubstrac = 20, secondSubstrac = 10;
        int expectedResult = firstSubstrac - secondSubstrac;
        int actualResult = MyCalculator.substrac(firstSubstrac, secondSubstrac);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testMultiplyMethod(){
        int firstOperand = 10, secondOperand = 5;
        int expectedResult = firstOperand*secondOperand;
        int actualResult = MyCalculator.multiply(firstOperand, secondOperand);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    void testDivisionMethod(){
        int firstValueDev = 60, secondValueDev = 20;
        int expectedResult = firstValueDev/secondValueDev;
        int actualResult = MyCalculator.devision(firstValueDev,secondValueDev);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testModulus(){
        int firstValueMod = 9, secondValueMod = 4;
        int expectedResult = firstValueMod%secondValueMod;
        int actualResult = MyCalculator.modulus(firstValueMod,secondValueMod);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
