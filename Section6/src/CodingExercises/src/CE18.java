package CodingExercises.src;


//Even Digit Sum
//        Write a method named getEvenDigitSum with one parameter of type int called number.
//
//        The method should return the sum of the even digits within the number.
//
//        If the number is negative, the method should return -1 to indicate an invalid value.

public class CE18 {
    public static int getEvenDigitSum(int number){
        if (number < 0) {
            return -1;
        } else{
            String convertedNumber = Integer.toString(number);
            int sum = 0;
            for (int i = 0; i <= convertedNumber.length(); i++){
                sum += Character.getNumericValue(convertedNumber.charAt(i));
            } return sum;
        }
    }
}
