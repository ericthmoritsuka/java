package Section5.src.CodingExercises.src;

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
