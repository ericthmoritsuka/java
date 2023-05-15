package CodingExercises.src;

//Last Digit Checker
//        Write a method named hasSameLastDigit with three parameters of type int.
//
//        Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//        The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
//
//Write another method named isValid with one parameter of type int.
//
//        The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

public class CE20 {
    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        //using the isValid function to check if ns are acceptable
        //I ask if they are valid, if they are not (!), return false
        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        } else {
            //getting the last number
            int lastN1 = n1 % 10;
            int lastN2 = n2 % 10;
            int lastN3 = n3 % 10;
            //at least 2 have to be equal
            //there are 4 cases overall. Comparing one with the other and all of them
            if ((lastN1 == lastN2) || (lastN1 == lastN3) || (lastN2 == lastN3)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11, 22, 31));

    }
}
