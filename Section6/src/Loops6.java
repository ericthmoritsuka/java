public class Loops6 {
    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 0) {
            sum = -1;
        } else {
            String numberStr = Integer.toString(number);
            for (int i = 0; i < numberStr.length(); i++) {
                int digit = Character.getNumericValue(numberStr.charAt(i));
                sum += digit;
            }
        }
        return sum;
    }

    public static int sumDigitsMod(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number > 9) { //this repeats until there is one number which will not be added here.
                sum += number % 10; // it gives me the number on the right
                number = number / 10; // it eliminates the number on the right
            }
            sum += number; // adds the last digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(7));
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(12));
        System.out.println(sumDigits(-12));
        System.out.println();
        System.out.println(sumDigitsMod(125));
        System.out.println(sumDigitsMod(7));
        System.out.println(sumDigitsMod(1000));
        System.out.println(sumDigitsMod(12));
        System.out.println(sumDigitsMod(-12));

    }
}
