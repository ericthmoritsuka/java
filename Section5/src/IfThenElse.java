public class IfThenElse {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 100;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score >= 100) {
//            System.out.println("⭐ ⭐ ⭐");
//        } else if (score < 100 && score >= 75) {
//            System.out.println("⭐ ⭐");
//        } else if (score < 75 && score >= 30) {
//            System.out.println("⭐");
//        } else {
//            System.out.println("No stars...");
//        }

        //Challenge
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("");
        System.out.println("Challenge");
        if (gameOver) {
            score += (levelCompleted * bonus);
            System.out.println("Your final score: " + score);
        }
    }
}
