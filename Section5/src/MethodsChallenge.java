public class MethodsChallenge {

    public static void displayHSPosition (String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHSPosition (int score){
        int position;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }

    public static void main(String[] args) {
        displayHSPosition("John", calculateHSPosition(1500));
        displayHSPosition("Jack", calculateHSPosition(999));
        displayHSPosition("Jane", calculateHSPosition(499));
        displayHSPosition("Judy", calculateHSPosition(99));
        displayHSPosition("Jessica", calculateHSPosition(-1000));
    }
}
