public class primitiveTypes3 {
    public static void main(String[] args){
        char character = 'D'; //one character, literal enclosed in single quotes. Whereas a string can hold multiple characters, literal enclosed in double quotes.
        //char character2 = 'BB'; we have an error here as there are 2 characters.
        //we can use it to store the last pressed key in a game or to loop progammatically through letters in an alphabet.
        //it occupies 2 bytes of memory = 16 bits.
        char unicode = '\u0044';
        char decimal = 68;
        System.out.println(character);
        System.out.println(unicode);
        System.out.println(decimal);
        System.out.println();

        //challenge
        System.out.println("Challenge: ");
        char challengeChar = '?';
        char challengeUnicode = '\u003F';
        char challengeDecimal = 63;
        System.out.println("My values are: ");
        System.out.println(challengeChar);
        System.out.println(challengeUnicode);
        System.out.println(challengeDecimal);
        System.out.println();
        System.out.print("My values are: " + challengeChar + challengeUnicode + challengeDecimal);
        System.out.println();

        // boolean trueValue = true;
        // boolean falseValue = false;
    }
}