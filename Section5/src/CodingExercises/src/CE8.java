public class CE8 {
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
