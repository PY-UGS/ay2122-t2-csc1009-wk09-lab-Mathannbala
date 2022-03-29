import org.junit.jupiter.api.Test;

import static java.lang.Character.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomCharacterTest {

    RandomCharacter test = new RandomCharacter();

    @Test
    void testRandomCharacter(){
        assertTrue(isLetterOrDigit(test.getRandomCharacter()));
    }

    @Test
    void testRandomLowerCaseLetter(){
        assertTrue(isLowerCase(test.getRandomLowerCaseLetter()));
    }

    @Test
    void testRandomUpperCaseLetter(){
        assertTrue(isUpperCase(test.getRandomUpperCaseLetter()));
    }

    @Test
    void testRandomDigitCharacter(){
        assertTrue(isDigit(test.getRandomDigitCharacter()));
    }

    @Test
    public void testPrime(){
        int val = (int)test.getRandomDigitCharacter()-48;
        assertTrue(isPrimeNumber(val));
    }


    public boolean isPrimeNumber(int num){
        //prime numbers are whole numbers greater than 1
        if(num<=1){
            return false;
        }
        //are divisible only by the number 1 or itself
        for (int i=2;i<num;i++){

            if(num%i==0){
                return false;
            }
        }
        return true;

    }

}