public class primitiveTypes4 {
    public static void main(String[] args){
        String string1 = "This is a string";
        System.out.println(("string1 is equal to " + string1));
        String string2 = string1 + ", and this is more.";
        System.out.println(("string2 is equal to " + string2));
        String string3 = "I wish I had U\u00241,000,000.00";
        System.out.println(string3);
        System.out.println();

        String stringNumber = "250.55";
        String stringNumber2 = stringNumber + "49.45";
        System.out.println(stringNumber2);
        //we can't do this int number = "10";
        //it will generate an error

        String stringNumber3 = "14";
        int stringNumber4 = 24;
        String stringNumber5 = stringNumber3 + stringNumber4;
        System.out.println(stringNumber5); //it will consider it a concatenation of 2 strings. It will happen everytime we use + after a string.
        String stringNumber6 = stringNumber4 + stringNumber3;
        System.out.println(stringNumber6);
        //strings are immutable in Java. So, this concatenation is, in fact, a new string that is being created.
        //StringBuilder is mutable.
    }
    
}
