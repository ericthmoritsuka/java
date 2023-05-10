public class Loops2 {
    public static boolean isPrime(int number) {
        if (number < 2) {
            //negative numbers, 0, and 1 are not prime numbers
            return false;
        } else {
            for (int divisor = 2; divisor < number; divisor++) {
                //it does not include the divisor
                //otherwise we would get a number % number == 0
                //we could also do divisor <= number / 2;
                if (number % divisor == 0) {
                    //if any division between the number and any divisor
                    //generates a remainder of 0, it means that the number is
                    //divisible by the divisor.
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        //challenge
        int counter = 0;
        for (int number = 2341; number <= 5123; number++) {
            //we can also add counter < 3 to the condition of the loop;
//            if (isPrime(number) && counter < 3){
//                System.out.println(number + " is " + (isPrime(number) ? "" : "NOT ") + "a prime number");
//                counter += 1;
//                System.out.println(number + " is a prime number.");
//                System.out.println("We have found " + counter + " prime numbers so far");
//            }
            if (isPrime(number)){
                counter += 1;
                System.out.println("The number " + number + " is prime.");
//                System.out.println("Total of " + counter + " prime numbers.");
                if (counter == 10) {
                    System.out.println("10 prime numbers found. Exiting.");
                    break;
                }
            }

        }

    }

}
