package CodingExercises.src;

//First And Last Digit Sum
//        Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//
//        The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
//
//        If the number is negative then the method needs to return -1 to indicate an invalid value.

public class CE17 {
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
