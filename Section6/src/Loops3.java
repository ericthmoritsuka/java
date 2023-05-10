public class Loops3 {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int number = 1; number <= 1000; number++){
            if(number%3 == 0 && number%5 == 0 ){
                counter++;
                sum += number;
                System.out.println("number: " + number);
                System.out.println("sum: " + sum);
                if (counter == 5){
                    System.out.println("Total sum: " + sum);
                    break;
                }
            }
        }
    }
}
