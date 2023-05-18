package CodingExercises.src;

//Largest Prime
//        Write a method named getLargestPrime with one parameter of type int named number.
//
//        If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
//
//        The method should calculate the largest prime factor of a given number and return it.

public class CE26 {

    public static boolean isPrime (int number) {
        if (number < 1) {
            return false;
        } else if (number ==2) {
            return true;
        } else {
            for (int i = 2; i < number; i++){
                if (number % i == 0) {
                    return false;
                }
            }
        } return true;
    }

    public static boolean isFactor (int factor, int number) {
        if(number % factor == 0){
            return true;
        } return false;
    }

    public static int getLargestPrime (int number) {
        int largestPrime = -1;
        if (number < 0){
            return -1;
        } else {
            for (int i = 2; i <= number; i++) {
                if (isPrime(i) && isFactor(i, number)){
                    if (i > largestPrime){
                        largestPrime = i;
                    }
                }
            }
        } return largestPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(21));
    }
}
