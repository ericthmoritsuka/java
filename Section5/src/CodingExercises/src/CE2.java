public class CE2 {

//    Speed Converter
//1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long.
//
//    If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
//
//            Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.
//
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
