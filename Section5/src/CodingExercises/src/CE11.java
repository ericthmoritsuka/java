package Section5.src.CodingExercises.src;

//Equality Printer
//        Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
//
//        If one of the parameters is less than 0, print text "Invalid Value".
//
//        If all numbers are equal print text "All numbers are equal"
//
//        If all numbers are different print text "All numbers are different".
//
//        Otherwise, print "Neither all are equal or different".

public class CE11 {
    public static void printEqual(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && a == c) {
            //if all numbers are equal, a = b and a = c (which would mean that a = c)
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && b != c) {
            //on the other hand, to guarantee that the numbers are all different
            //a != b, a != c and b != c. Otherwise, b and c may be equal and we will have an error.
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
