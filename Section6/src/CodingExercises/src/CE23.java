package CodingExercises.src;

//Perfect Number
//        What is the perfect number?
//        A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//        Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
//        For example, take the number 6:
//        Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.
//
//        Therefore, 6 is a perfect number (as well as the first perfect number).
//
//
//
//        Write a method named isPerfectNumber with one parameter of type int named number.
//
//        If number is < 1, the method should return false.
//
//        The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false.

public class CE23 {
    public static boolean isPerfectNumber (int number) {
        int sum = 0;
        if (number < 1) {
            return false;
        } else {
            //going for the factors
            for (int i = 1; i < number; i++){
                if (number % i == 0) {
                    //adding them up
                    sum += i;
                }
            }
            //checking if the sum is equal to the number itself (if it is a perfect number)
            if (sum == number) {
                return true;
            } else {
                return false;
            }
        }
    }

    //adding here if someone wants to check
//    public static void printFactors (int number) {
//        if (number < 1) {
//            System.out.println("Invalid Value");
//        } else {
//            //going from 1 to the number itself
//            for (int i = 1; i <= number; i++){
//                //checking if it divides the number completely (no remainder)
//                if (number%i == 0){
//                    //showing the factors
//                    System.out.print(" " + i);
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        //only 6, 28, 496, 8128.
        //you can use the factions method to check
        for (int i = 0; i <= 10000; i++){
            if (isPerfectNumber(i)){
                System.out.print(i + " ");
                System.out.println(isPerfectNumber(i));
            }
        }
    }
}
