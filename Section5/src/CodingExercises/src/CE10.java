package Section5.src.CodingExercises.src;

//Minutes To Years and Days Calculator
//        Write a method printYearsAndDays with parameter of type long named minutes.
//
//        The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
//
//        If the parameter is less than 0, print text "Invalid Value".
//
//        Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
//
//        XX represents the original value minutes.
//        YY represents the calculated years.
//        ZZ represents the calculated days.

public class CE10 {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = (minutes/(24*60))%365;
            long years = minutes/(365*24*60);
            System.out.println(String.format("%d min = %d y and %d d", minutes, years, days));
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
}
