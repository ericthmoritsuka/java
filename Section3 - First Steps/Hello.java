public class Hello{
    
    public static void main(String[] args){
        String name = "Eric";
        int firstNumber = 35;
        int secondNumber = 12;
        int thirdNumber = firstNumber*2;
        int total = firstNumber + secondNumber + thirdNumber;
        int last = 1000 - total;

        System.out.println("Hello, " + name);
        System.out.println("You are " + firstNumber + " years old");
        System.out.println("The sum of the numbers is " + total);
        System.out.println(last);
    }
}