package CodingExercises.src;

//Shared Digit
//        Write a method named hasSharedDigit with two parameters of type int.
//
//        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

public class CE19 {
    public static boolean hasSharedDigit (int n1, int n2){
        if((n1 < 10 || n1 > 99) || (n2 < 10 || n2 > 99)){
            return false;
        } else {
            String convertedN1 = Integer.toString(n1);
            String convertedN2 = Integer.toString(n2);
            for (int i = 0; i <= convertedN1.length(); i++){
                if (convertedN2.contains(Character.toString(convertedN1.charAt(i)))){
                    return true;
                }
            }
        }
        return false;
    }
}
