package Section3;

public class operands {
    public static void main(String[] args){
        int result1 = 1;
        result1 = result1 + 1; //or we can do result1++ or result1+=1 (abbreviated operator)
        System.out.println("result1 = " + result1);
        result1++;
        System.out.println("new result1 after result1++: " + result1);
        result1 += 1;
        System.out.println("new result1 after result1+=1 " + result1);

        System.out.println("");

        int result2 = 1;
        result2 = result2 - 1; //or we can do result2-- or result2-=1 (abbreviated operator)
        System.out.println("result2 = " + result2);
        result2--;
        System.out.println("new result2 after result2--: " + result2);
        result2 -= 1;
        System.out.println("new result2 after result2-=1 " + result2);

        System.out.println("");

        // Challenge
        int resultChallenge1 = 10;
        resultChallenge1 -= 35;
        System.out.println("resultChallenge1: " + resultChallenge1);
        resultChallenge1 -= -3.25; 
        System.out.println("resultChallenge1: " + resultChallenge1);
        //the data types are different. The result will return an int instead of a double. The abbreviated operator casts the value as int to make it work. 
        // If we used resultChallenge1 = resultChallenge1 - 3.25 we would get an error in return.
        //We can change the type of the variable to double to make the calculation work the way we want it.

        double resultChallenge2 = 10;
        resultChallenge2 -= 35;
        System.out.println("resultChallenge2: " + resultChallenge2);
        resultChallenge2 -= -3.25;
        System.out.println("resultChallenge2: " + resultChallenge2);

        //it also works with multiplications and divisions.
        double result3 = 10;
        result3 *= 5;
        System.out.println("result3 *5 = " + result3);
        result3 /=2;
        System.out.println("result3 /2 = " + result3);
    }
}
