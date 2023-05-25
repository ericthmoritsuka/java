import java.util.Calendar;
import java.util.Scanner;

public class ParsingValues2 {
    //we have to cd to the folder and java src/file.java in the terminal
    //it doesn't work if we run it here.
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String birthYear = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(birthYear);
        return "So, you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");
        System.out.println("What year were you born? ");

        boolean validBirthYear = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));

            try{
                age = checkData(currentYear, scanner.nextLine());
                validBirthYear = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed! Try again.");
            }
        } while (!validBirthYear);

        return "So, you are " + age + " years old";
    }

    public static int checkData(int currentYear, String oringinalBirthYear) {
        int birthYear = Integer.parseInt(oringinalBirthYear);
        int minimumYear = currentYear - 125;

        if ((birthYear < minimumYear) || (birthYear > currentYear)) {
            return -1;
        }
        return (currentYear - birthYear);
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
//        int currentYear = 2023;
//        try {
//            System.out.println(getInputFromConsole(currentYear));
//        } catch (NullPointerException e) {
//            System.out.println(getInputFromConsole(currentYear));
//        }
//    }
        System.out.println(getInputFromScanner(currentYear));
    }
}
