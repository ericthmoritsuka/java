public class CE2 {
    public static long toMilesPerHour(double kilometersPerHour){
        double milesPerHour;
        double conversionValue = 1.609d;

        if(kilometersPerHour < 0) {
            return -1; //to indicate the value is invalid.
        } else {
            milesPerHour = kilometersPerHour / conversionValue;
            return Math.round(milesPerHour); //the round method returns a long number.
        }
    }

    public static void printConversion(double kilometersPerHour){
        int milesPerHour = (int)(toMilesPerHour(kilometersPerHour)); //to make it non-float
        if(milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
