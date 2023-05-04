public class CE5 {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            //it has to be evenly divided by 4 but not by 100,
            //or, if it is evenly divided by 100, it also has to be by 400
            //but 400 is evenly divided by 100 so, we don't need both cases.
            if (((year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
