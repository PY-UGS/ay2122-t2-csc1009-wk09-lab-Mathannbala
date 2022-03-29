import java.util.Random;

public class RandomCharacter {
    Random rand = new Random();

    public char getRandomLowerCaseLetter() {
        //method is used to get one random lower case character between ‘a’ and ‘z
        return (char) (rand.nextInt(26) + 'a');
    }

    public char getRandomUpperCaseLetter() {
        //method is used to get one random upper case letter between ‘A’ and ‘Z’
        return (char) (rand.nextInt(26) + 'A');

    }

    public char getRandomDigitCharacter() {
        //method is used to get one random digit number between ‘0’ and ‘9’
        int temp = 48; //ASCII of 0 is 48, need include else will get funny output in randomCharacter
        return (char)(temp+rand.nextInt(10));
    }

    public char getRandomCharacter() {
        // use the methods above to combine, do using if-else
        int choice =3;
        //only 3 options
        choice = (char) rand.nextInt(3);

        if(choice==0){
            return getRandomLowerCaseLetter();
        }
        else if(choice==1){
            return getRandomUpperCaseLetter();
        }
        else if(choice==2){
            return getRandomDigitCharacter();
        }
        else
            return '1';

    }
}


class Main{
    public static final int RANDOM_CHARACTERS =15;

    public static void main(String[] args){
        RandomCharacter ranchar = new RandomCharacter();

         String lowercase = "";
         String uppercase = "";
         String digit = "";
         String character = "";

         for(int i =0; i < RANDOM_CHARACTERS; i++){
             lowercase += ranchar.getRandomLowerCaseLetter();
             uppercase += ranchar.getRandomUpperCaseLetter();
             digit += ranchar.getRandomDigitCharacter();
             character += ranchar.getRandomCharacter();
         }

         System.out.println(lowercase);
         System.out.println(uppercase);
         System.out.println(digit);
         System.out.println(character);

    }
}
