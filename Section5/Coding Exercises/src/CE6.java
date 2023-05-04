public class CE6 {
    public static boolean areEqualByThreeDecimalPlaces (double n1, double n2) {
        return (int) (n1 * 1000) == (int) (n2 * 1000);
        //as the int ignores all decimals, when we multiply by 1000 we get the 3 decimals and only that.
    }
}
