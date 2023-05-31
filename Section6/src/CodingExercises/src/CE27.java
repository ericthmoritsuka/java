package CodingExercises.src;

//Diagonal Star
//        Write a method named printSquareStar with one parameter of type int named number.
//
//        If number is < 5, the method should print "Invalid Value".
//
//        The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).

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
