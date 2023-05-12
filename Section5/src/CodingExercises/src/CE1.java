public class CE1 {

//    Positive, Negative or Zero
//    Write a method called checkNumber with an int parameter number.
//
//    The method should not return any value, and it needs to print out:
//
//            "positive" if the parameter number is > 0
//
//            "negative" if the parameter number is < 0
//
//            "zero" if the parameter number is equal to 0

    public static void checkNumber(int number) {
        System.out.println((number > 0) ? "positive": ((number < 0) ? "negative" : "zero"));
    }
}
