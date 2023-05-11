public class Loops4 {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            System.out.println("for " + i);
        }

        //different from the for loop, we have to declare the variable first.
        int j = 1;
        while (j <= 5){
            System.out.println("while " + j);
            j++; //we have to add the increment
        }

        //or we can tie the loop to a condition that will be checked every iteration
        int k = 1;
        while (true){
            if (k > 5){
                break;
            } else {
                System.out.println("while2 " + k);
                k++;
            }
        }

        //do-while is different because it will execute at least once
        //the condition is checked at the end of the iteration.
        int l = 1;
        boolean test = false;
        while (test) {
            if (l > 5) {
                break;
            } else {
                System.out.println("while3 " + l);
                l++;
            }
        }

        //do this while this condition is true
        do {
            if (l > 5) {
                break;
            } else {
                System.out.println("dowhile " + l);
                l++;
                //test = (l>0);
                //we can make the condition true and keep the loop going
            }
        } while (test);


        //continue will stop executing the current iteration and start a new one.
        int m = 0;
        while (m < 50) {
            m += 5;
            if (m % 25 == 0) {
                continue; //we will skip the iterations with multiples of 25 (25 and 50)
            } else {
                System.out.print(m + "  ");
            }
        }
    }
}
