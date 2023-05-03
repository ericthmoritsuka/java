import java.time.Year;

public class Methods {
    //a method declares executable code that can be invoked, passing a fixed number of values as arguments.
    //it reduces code duplication
    //sometimes, we may call methods functions or, if they do not return a value, procedures.

    //lower camel case for method names
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score: " + finalScore);
        }
    }

    //the modifiers (public, static, void) are keywords with special meanings.
    //void is a keyword meaning no data is returned from a method
    //the return type can be any primitive data type or class.
    //if a return type is defined, the code block must use at least one return statement,
    //returning a value, of the declared type or comparable type.
    public static int calculateAge (int year) {
        int currentYear = Year.now().getValue();
        return (currentYear - year);
    }

    public static void main(String[] args) {
        calculateScore(true, 10000, 6, 200);
        calculateScore(true, 5000, 3, 50);
        System.out.println("You are " + calculateAge(2000) + " years old.");
    }
}
