package CodingExercises.src;

public class CE22 {
    public static int getGreatestCommonDivisor(int first, int second) {
        int greatest = 0;
        if (first < 10 || second < 10) {
            return -1;
        } else {
            for (int i = 1; i <= first; i++) {
                //checking if i is a factor of first
                if (first % i == 0) {
                    //if it is, I check if it is also a factor for second
                    if (second % i == 0) {
                        //then, I check if it is greater than the one I have saved (initially 0)
                        //if it is, I save it, so I can always have the greatest common divisor
                        if (i > greatest) {
                            greatest = i;
                        }
                    }
                }
            }
        }
        return greatest;
    }
}
