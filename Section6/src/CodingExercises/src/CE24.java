package CodingExercises.src;

//Number To Words
//        Write a method called numberToWords with one int parameter named number.
//
//        The method should print out the passed number using words for the digits.
//
//        If the number is negative, print "Invalid Value".
//
//        To print the number as words, follow these steps:
//
//        Extract the last digit of the given number using the remainder operator.
//
//        Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
//
//        Remove the last digit from the number.
//
//        Repeat Steps 2 through 4 until the number is 0.
//
//        The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.
//
//        The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
//
//        Use the method reverse within the method numberToWords in order to print the words in the correct order.
//
//        Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.
//
//        The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
//        For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).

public class CE24 {

    public static void numberToWords(int number) {
        //I will use the counter to go through the whole number even if it was 100, and I reversed it to 1.
        //in case I reverse it to 1, I will use the counter to add the zeroes after the number.
        int counter = getDigitCount(number);
        //the number is now reversed
        number = reverse(number);

        //if the number is negative, I return a message, as I am doing this check in getDigitCount()
        //I am reusing the method here
        if (counter == -1) {
            System.out.println("Invalid Value");
        } else {
            //it will run through every digit in my original number and add Zero if there is
            //no more digits to go through.
            while (counter > 0) {
                //getting the last digit (the first in the original number)
                //I think I could have used switch case and 0 as default.
                int digit = number % 10;
                if (digit == 1) {
                    System.out.print(" One");
                } else if (digit == 2) {
                    System.out.print(" Two");
                } else if (digit == 3) {
                    System.out.print(" Three");
                } else if (digit == 4) {
                    System.out.print(" Four");
                } else if (digit == 5) {
                    System.out.print(" Five");
                } else if (digit == 6) {
                    System.out.print(" Six");
                } else if (digit == 7) {
                    System.out.print(" Seven");
                } else if (digit == 8) {
                    System.out.print(" Eight");
                } else if (digit == 9) {
                    System.out.print(" Nine");
                } else {
                    System.out.print(" Zero");
                }
                //going to the next digit and reducing the counter
                number /= 10;
                counter -= 1;
            }
        }
    }

    //Reversing the number by getting the last digits and adding it up again.
    //324 -> digit = 4 -> reversedNumber = (0*10) + 4 -> 4 -> number = 32;
    //32 -> digit = 2 -> reversedNumber = (4*10) + 2 -> 42 -> number = 3;
    //3 -> digit = 3 -> reversedNumber - (42*10) + 3 -> 423 -> number = 0;
    public static int reverse (int number){
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    //Getting the amount of digits in the number.
    //I did a do-while because it had to run at least once to guarantee that I would have
    //1 digit in valid numbers such as 0.
    //If I used while, it would not get into the loop the first time and the counter would be 0
    //even if the number had 1 digit.
    public static int getDigitCount (int number) {
        int counter = 0;
        if (number < 0) {
            return -1;
        } else {
            do {
                counter += 1;
                number /= 10;
            } while (number != 0);
        } return counter;
    }

    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(32));
//        System.out.println(getDigitCount(100));
//        System.out.println(getDigitCount(-123));

//        System.out.println(reverse(0));
//        System.out.println(reverse(32));
//        System.out.println(reverse(100));
//        System.out.println(reverse(-123));

//        numberToWords(0);
//        System.out.println();
        numberToWords(32);
//        System.out.println();
//        numberToWords(100);
//        System.out.println();
//        numberToWords(-123);
    }
}
