public class Switch {
    //we can only use switch with byte, short, int, char
    //Byte, Short, Integer, Character, String and enum
    //We cannot use it with long, float, double, or boolean (or their wrappers)

    public static void switchNumbers(int value) {
        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It was either 3, 4, or 5");
                System.out.println("It was a " + value);
                break;
            default:
                System.out.println("It was not 1, 2, 3, 4, or 5");
                break;
        }
    }

//    enhanced version (for newer versions of JDK):
//    switch(value) {
//        case 1 -> System.out.println("Value was 1");
//        case 2 -> System.out.println("Value was 2");
//        case 3, 4, 5 -> {
//            System.out.println("It was either 3, 4, or 5");
//            System.out.println("It was a " + value);
//        }
//        default -> System.out.println("IT was not 1, 2, 3, 4, or 5");
//    }

    public static void switchMonths(String month){
        //I could do it using return instead of the println and breaks and adding a return
        //statement after the } that encloses the switch block.
        //Well, I would have to change void and use String as well.
        //(enhanced version)
        //Sometimes, we may have to use yield instead of the last return (used with the default case)
        //it is used in a coding block. It is implicit in coding lines.
        switch(month){
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                System.out.println(month + " is in the 1st quarter");
                break;
            case "APRIL":
            case "MAY":
            case "JUNE":
                System.out.println(month + " is in the 2nd quarter");
                break;
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                System.out.println(month + " is in the 3rd quarter");
                break;
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                System.out.println(month + " is in the 4th quarter");
                break;
            default:
                System.out.println("BAD INPUT. TRY AGAIN");
                break;
        }
    }

    public static void switchAlphabet (char letter) {
        //using a .toUpperCase to accept all characters.
        char newLetter = Character.toUpperCase(letter);
        switch (newLetter) {
            case 'A':
                System.out.println("A is Alpha");
                break;
            case 'B':
                System.out.println("B is Bravo");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Delta");
                break;
            case 'E':
                System.out.println("E is Echo");
                break;
            default:
                System.out.println("The letter " + newLetter + " was not found");
                break;
        }
    }

//    challenge -> with enhanced switch
//
//    public static void printDayOfWeek(int day) {
//        switch (day) {
//            case 0 -> System.out.println("Sunday");
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            default -> System.out.println("Invalid Day");
//        }
//    }

    //Bonus challenge using if-else statements

    public static void printDayOfWeek (int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Day");
        }
    }

    public static void main(String[] args) {

        switchNumbers(5);
        switchNumbers(1);
        switchNumbers(8);
        switchNumbers(2);
        switchNumbers(423423);

        switchMonths("APRIL");
        switchMonths("JANUARY");
        switchMonths("DECEMBER");
        switchMonths("AUGUST");
        switchMonths("FEVEREIRO");

        switchAlphabet('a');
        switchAlphabet('D');
        switchAlphabet('e');
        switchAlphabet('J');
        switchAlphabet('k');

        printDayOfWeek(0);
        printDayOfWeek(5);
        printDayOfWeek(3);
        printDayOfWeek(-4);
        printDayOfWeek(165);
    }
}