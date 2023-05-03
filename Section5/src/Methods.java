public class Methods {
    //a method declares executable code that can be invoked, passing a fixed number of values as arguments.
    //it reduces code duplication
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score: " + finalScore);
        }
    }
    public static void main(String[] args) {
        calculateScore(true, 10000, 6, 200);
    }
}
