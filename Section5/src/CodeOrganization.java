public class CodeOrganization {
    public static void main(String[] args) {
        int variable = 50; //variable = 50 is the expression. The entire line is the statement
        //a valid java statement ends in ;

        variable++;
        variable--;
        //are also statements

        System.out.println("this"
        + " is"
        + " a test."
        );
        //this would also be a statement and not a code block

        int variable2=25;variable2--;variable2--;System.out.println("variable2 = " + variable2);
        //this also works although it is composed by 4 expressions in one line.
        //we can adjust automatically by going to Code -> reformat code
        //this option adjusts indentation as well

//        int variable2 = 25;
//        variable2--;
//        variable2--;
//        System.out.println("variable2 = " + variable2);

        //java ignores white spaces. We adjust to make it more readable.


    }
}
