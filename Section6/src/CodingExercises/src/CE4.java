package CodingExercises.src;

//Number Palindrome
//        Write a method called isPalindrome with one int parameter called number.
//
//        The method needs to return a boolean.
//
//        It should return true if the number is a palindrome number otherwise it should return false.
//
//        Check the tips below for more info about palindromes.

public class CE4 {
    public static boolean isPalindrome(int number) {
        String convertedNumber = Integer.toString(Math.abs(number));
        StringBuilder reversedNumber = new StringBuilder(convertedNumber);
        reversedNumber = reversedNumber.reverse();
        if (convertedNumber.equals(reversedNumber.toString())) {
            return true;
        } return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(55555));
        System.out.println(isPalindrome(623325));
        System.out.println(isPalindrome(623326));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(-1234));
    }
}
