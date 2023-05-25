package CodingExercises.src;

public class CE27 {
    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        } else {
            for (int row = 1;row <= number; row++){
                for (int column = 1; column <= number; column ++){
                    if (row ==1 || row == number || column == 1 || column == number || row == column || column == number - row + 1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printSquareStar(5);
        System.out.println();
        printSquareStar(8);
        System.out.println();
        printSquareStar(15);
        System.out.println();
        printSquareStar(32);
        System.out.println();
        printSquareStar(58);
        System.out.println();
        printSquareStar(116);
    }
}
