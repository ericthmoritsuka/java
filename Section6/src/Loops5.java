public class Loops5 {
    public static boolean isEven (int number) {
        return (number % 2 == 0) ? true : false;
    }


    public static void main(String[] args) {
        //my version
//        int i = 0;
//        while (i <= 50){
//            if (isEven(i)){
//                System.out.print(i + " ");
//                i++;
//            } else {
//                i++;
//                continue;
//            }
//        }

        //using the increment before
//        int i = 4;
//        int j = 20;
//        while (i <= j) {
//            i++; //start by iterating the number so I don't forget
//            if (isEven(i)) {
//                System.out.print(i + " ");
//            } continue;
//        }

        //The ideal version
        int i = 4;
        int j = 20;
        while (i <= j) {
            i++; //start by iterating the number so I don't forget
            if (!isEven(i)) {
                continue; //continue should come first. If the element
                //does not correspond to the condition, I can skip the rest of the code
                //instead of skipping (which would make no sense since I would have
                //skipped the code already in some way).
            } System.out.print(i + " ");
        }

        //challenge
        //I think something is off here. Not sure what is. Did not give it much thought.
        System.out.println();
        int minOriginal = 4;
        int min = minOriginal; //otherwise we start at 1 as we add min++ right away
        int max = 20;
        int counterEven = 0;
        int counterOdd = 0;
        while (min <= max) {
            min++;
            if (!isEven(min)) {
                counterOdd++;
                continue;
            } else {
                System.out.print(min + " ");
                counterEven++;
                if (counterEven >= 5) {
                    break;
                }
            }
        }
        System.out.println();
        System.out.println(counterEven + " even numbers were found between " + minOriginal + " and " + max);
        System.out.println(counterOdd + " odd numbers were found between " + minOriginal + " and " + max);
    }
}
