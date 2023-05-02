//public is an access modifier. It allows us to define which parts of our code, or even someone else's code, can access a particular element.
//public gives full access.
//class is a keyword that defines a class. FirstClass is the name of the class in this case.
//the content of the class is between{}
public class FirstClass {
    //public static void main is a method.
    //a method is a collection of statements, one or more, that perform an operation
    //the main method is the entry point for any Java code.
    //Java looks for the main method to start and run the program when we use it.
    //public is an access modifier here as well.
    //static refers to object orientation.
    //void means that this method will not return anything.
    //String[] args is a parameter through which we pass information to the method.
    public static void main(String[] args) {
        String name = "Eric";
        System.out.print("Hello, " + name);
    }
}
