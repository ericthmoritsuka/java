package CodingExercises.src;

public class CE25 {

    //I had to organize it better... I did it all but I forgot to separate the case in which bigCount was bigger than goal
    //or something like this... Something wasn't working properly.

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // Check for negative parameters
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Calculate the total kilos of flour from bigCount and smallCount
        int totalKilos = bigCount * 5 + smallCount;

        // Check if the total kilos fulfill the goal
        if (totalKilos < goal) {
            return false;
        } else if (totalKilos == goal) {
            return true;
        } else {
            // Check if it is possible to make a package using full bags
            int remainingKilos = goal % 5;  // Kilos left after using big bags

            if (remainingKilos <= smallCount) {
                return true;
            }
        }

        return false;
    }

//    public static boolean canPack (int bigCount, int smallCount, int goal) {
//
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        } else {
//            //how many b fit in goal?\
//
//            //hypothetically, how many bigCount fit in goal
//            int bigFitInGoal = goal/5;
//            //how much would I still need after I used the bigCount
//            //this is an intermediate value for the last step
//            int restAfterBigCount = Math.abs(bigFitInGoal - bigCount);
//            //the rest of the initial hypothetical situation
//            //this is an intermediate value for the last step
//            int restAfterBigFitInGoal = Math.abs(bigFitInGoal*5 - goal);
//            //this is the last value, how much do we need after we used
//            //the bigCount bags + how much do I still need after I took in consideration
//            //the hypothetical bigCounts in goal.
//            int remainder = (restAfterBigCount*5) + restAfterBigFitInGoal;
//
//            System.out.println(bigFitInGoal);
//            System.out.println(restAfterBigCount);
//            System.out.println(restAfterBigFitInGoal);
//            System.out.println(remainder);
//
//            if (smallCount >= remainder) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }


//    public static boolean canPack (int bigCount, int smallCount, int goal) {
//        int fiveInGoal = 0;
//        int remainder = 0;
//
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        } else {
//            if ((bigCount*5) + smallCount < goal) {
//                return false;
//            } else {
//                fiveInGoal = goal/5;
//                if (fiveInGoal > bigCount) {
//                    remainder += (fiveInGoal-bigCount)*5;
//                    remainder += remainder + goal%5;
//                } else {
//                    remainder = goal%5;
//                }
//            }
//            if (smallCount >= remainder){
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }

    public static void main(String[] args) {
//        System.out.println(canPack(0, 5, 6));
//        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(2, 1, 5));
//        System.out.println(0/5);
//        System.out.println(Math.abs(0*5 - 6));
    }
}
