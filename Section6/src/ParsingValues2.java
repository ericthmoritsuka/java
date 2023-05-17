import java.util.Scanner;

public class ParsingValues2 {
    //we have to cd to the folder and java src/file.java in the terminal
    //it doesn't work if we run it here.
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String birthYear = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(birthYear);
        return "So, you are " + age + " years old";
    }

    public static String getInputFromScanner (int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");
        System.out.println("What year were you born? ");
        String birthYear = scanner.nextLine();
        int age = currentYear - Integer.parseInt(birthYear);
        return "So, you are " + age + " years old";
    }

    public static void main(String[] args) {
        int currentYear = 2022;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromConsole(currentYear));
        }
    }
}
