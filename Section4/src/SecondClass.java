public class SecondClass {

    public static void main(String[] args) {
        String name = "Eric";
        System.out.println("Hello, " + name);

        boolean isEarthling, isAlien;
        isEarthling = true;
        isAlien = false;
        if (isEarthling) {
            //if we have one line as result, we can eliminate the {}
            //otherwise, it is best to use a code block to indicate the results.
            System.out.println("Hello World");
        } else if (!isEarthling || isAlien) {
            System.out.println("Hello Earth");
        }

        int score = 100;
        int topScore = 100;
        int intermediateScore = 80;
        int lowScore = 50;
        if (score == topScore) {
            System.out.println("Maximum Score!!! Congratulations!");
        } else if ((score < topScore) && (score >= intermediateScore)) {
            System.out.println("Not the maximum score! But it was almost there");
        } else if ((score < intermediateScore) && (score > lowScore)) {
            System.out.println("Low score. You can do better, try again.");
        } else {
            System.out.println("Well... if you keep practicing you may get better.");
        }

        int value = 50;
        if (value == 50) {
            //if we use value = 50, we would get an error warning but because of the type and not the =
            System.out.println("The value is " + value + "!");
        }

        //we can use shortcuts with if (boolean) or if (!boolean)

        String motoBrand;
//        String motoMessage;
        motoBrand = "BMW";
        motoBrand = "Honda";
        motoBrand = "Aprilla";
        motoBrand = "Yamaha";
        //this is a ternary operator
        boolean isJapanese = motoBrand == "Yamaha" || motoBrand == "Honda" ? true : false;

//        if (isJapanese) {
//            motoMessage = " is a Japanese brand";
//        } else {
//            motoMessage = " is not a Japanese brand";
//        }
        String motoMessage = (isJapanese) ? " is a Japanese brand" : " is not a Japanese brand";
        System.out.println(motoBrand + motoMessage);
        //if we used the strings directly in isJapanese, it would not work because it was expecting a boolean.
        //instead, we provided it with a ternary operator.


        //Challenge
        System.out.println();
        System.out.println("Challenge: ");
        double doubleChallenge1 = 20.00d;
        double doubleChallenge2 = 80.00d;
        double resultChallenge1 = (doubleChallenge1 + doubleChallenge2) * 100.00d;
        double remainderChallenge1 = resultChallenge1 % 40.00d;

        boolean booleanChallenge1 = remainderChallenge1 == 0.00d ? true : false;
        System.out.println("(" + doubleChallenge1 + " + " + doubleChallenge2 + ")" + " * " + "100.00 = " + resultChallenge1 );
        System.out.println("If " + resultChallenge1 + " % 40.00 == 0.00, booleanChallenge1 = true, otherwise, booleanChallenge1 = false");
        System.out.println("remainderChallenge1 is " + remainderChallenge1 + ". Hence, booleanChallenge1 is " + booleanChallenge1);

        if (!booleanChallenge1) {
            System.out.println("There is some remainder left.");
        }
    }
}
