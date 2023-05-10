package CodingExercises.src;

public class CE3 {
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        } else {
            if(number%2 != 0){
                return true;
            }
        } return false;
    }

    public static int sumOdd (int start, int end) {
        if((end >= start) && (start > 0 && end > 0)) {
            int sum = 0;
            for (int number = start; number <= end; number++){
                if (isOdd(number)){
                    sum += number;
                }
            } return sum;
        } return -1;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 11));
    }
}
