import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            try{
                int number = Integer.parseInt(scanner.nextLine());
                if (number < min){
                    min = number;
                }
                if (number > max){
                    max = number;
                }
                count += 1;
                System.out.println("You entered " + count + " numbers so far");
                System.out.println("The minimum number is: " + min);
                System.out.println("The maximum number is: " + max);
            } catch (NumberFormatException badInput) {
                System.out.println("Not a number, ending the program");
                System.out.println("You entered " + count + " numbers");
                System.out.println("The smallest number was: " + min);
                System.out.println("The largest number was: " + max);
                break;
            }
        }
    }

}
