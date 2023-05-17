import java.util.Calendar;

public class ParsingValues {

    public static int calculateAge(int year){
        //If we were using input from the user, it would probably come as a String
        //if we use it as string + int, it parses the int into a String
        //and the result would not be right.

        int currentYear = 2023;
        String inputBirthYear = "1987";

        //parsing the String into an int
        //             className.method()
        int birthYear = Integer.parseInt(inputBirthYear);
        return currentYear - birthYear;

//        Option we can use with the current year from the system

//        Calendar calendar = Calendar.getInstance();
//        int currentYear = calendar.get(Calendar.YEAR);
//        return currentYear - birthYear;
    }

    public static void main(String[] args) {
        System.out.println(calculateAge(1987));

//        we can also parse strings into doubles.
        String test = "12.5";
        double testDouble = Double.parseDouble(test);
    }
}
