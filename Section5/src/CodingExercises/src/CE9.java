package Section5.src.CodingExercises.src;

public class CE9 {

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
