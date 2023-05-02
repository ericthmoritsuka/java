public class KeywordsAndExpressions {
    public static void main(String[] args) {
        double distance = 100.00d;
        double kilometers = (distance * 1.609344);

        System.out.println("The distance in miles: " + distance);
        System.out.println("The distance in km: " + kilometers);

        int score = 52;
        int bonus = 100;
        if(score > 50){
            score = bonus + score; //adding bonus
        }
        int health = 24;
        int negativeBonus = 75; //expression

        if((health < 25) && (score > bonus)){ //statement
            score = score - negativeBonus;
        }
        System.out.println(score);
    }
}
