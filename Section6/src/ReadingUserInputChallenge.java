import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void sum5Numbers (){
        int counter = 1;
        int sum = 0;
        int number = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter number #" + counter + ": ");
            try{
                number = Integer.parseInt(scanner.nextLine());
                if (number <0) {
                    System.out.println("Negative numbers are not allowed.");
                    continue;
                }
                counter += 1;
                sum += number;
            } catch(NumberFormatException badUserData) {
                System.out.println("Characters not allowed! Try again.");
            }
        } while (counter <= 5);
        System.out.println("The sum of all 5 numbers was " + sum);
    }

    public static void main(String[] args) {
        sum5Numbers();
    }
}
