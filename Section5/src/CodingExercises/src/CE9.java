package Section5.src.CodingExercises.src;

public class CE9 {

//    Area Calculator
//    Write a method named area with one double parameter named radius.
//
//    The method needs to return a double value that represents the area of a circle.
//
//    If the parameter radius is negative then return -1.0 to represent an invalid value.
//
//    Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
//
//    The method needs to return an area of a rectangle.
//
//    If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
//
//    For formulas and PI value please check the tips below.

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0d;
        } else {
            double area = Math.pow(radius, 2) * Math.PI;
            return area;
        }
    }

    public static double area (double x, double y){
        if(x < 0 || y < 0) {
            return -1.0d;
        } else {
            double area = x * y;
            return area;
        }
    }

    public static void main(String[] args) {

    }
}
