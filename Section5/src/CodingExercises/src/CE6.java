public class CE6 {

//    DecimalComparator
//    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//    The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
//
    public static boolean areEqualByThreeDecimalPlaces (double n1, double n2) {
        return (int) (n1 * 1000) == (int) (n2 * 1000);
        //as the int ignores all decimals, when we multiply by 1000 we get the 3 decimals and only that.
    }
}
