package CodingExercises.src;

public class CE5 {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        } else {
            String convertedNumber = Integer.toString(number);
            int first = Character.getNumericValue(convertedNumber.charAt(0));
            int last = Character.getNumericValue(convertedNumber.charAt(convertedNumber.length() -1));
            int sum = first + last;
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
    }
}
