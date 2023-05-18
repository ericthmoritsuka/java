package CodingExercises.src;

//Largest Prime
//        Write a method named getLargestPrime with one parameter of type int named number.
//
//        If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
//
//        The method should calculate the largest prime factor of a given number and return it.
//It asks for just one method. I used 3 methods in CE26

public class CE26II {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1; // Invalid value
        }

        int largestPrime = -1;

        // Find and update the largest prime factor
        //it was necessary to use a loop inside a loop to do this check.
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                boolean isPrime = true; //using this boolean to check afterwards if it is the largest
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }

}
