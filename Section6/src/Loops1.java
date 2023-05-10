public class Loops1 {
//    for (init; expression; increment){
//        statements
//    }

//    *once expression is false, it stops the loop

    public static double calculateInterest (double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static void main(String[] args) {

//        while the counter is smaller or equal 5, print counter.
//        for each iteration, add 1 to the counter.
//        the loop ends once counter gets to 6 and we do not enter the loop again.
        for (int counter = 1; counter <=5; counter++){
            System.out.println(counter);
        }

        for (double interestRate = 2; interestRate <=5; interestRate++){
            System.out.println("12,320 at " + interestRate + "% interest = " + calculateInterest(12320, interestRate));
        }

        //challenge
        for (double interestRate = 7.5; interestRate <=10; interestRate += 0.25){
            System.out.println("100 at " + interestRate + "% interest = $" + calculateInterest(100, interestRate));
            if (interestRate > 9.25) {
                break; //We can use a break statement to stop the loop whenever we want.
            }
        }
    }
}
