public class CE8 {

//    Teen Number Checker
//    We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//
//    Write a method named hasTeen with 3 parameters of type int.
//
//    The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    public static boolean hasTeen (int n1, int n2, int n3){
        int[] ages = {n1, n2, n3};

        for (int age : ages) {
            if(isTeen(age)){
                return true;
            }
        }
        return false;
    }

    public static boolean isTeen (int n1) {
        int[] teens = {13, 14, 15, 16, 17, 18, 19};
        for (int age : teens) {
            if (n1 == age) {
                return true;
            }
        }
        return false;
    }
}
