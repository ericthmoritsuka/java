package Section5.src;

//challenge

public class OverloadedMethods1 {

    public static double convertToCentimeters (int heightInches){
        double convertedHeight = heightInches * 2.54;
        return convertedHeight;
    }

    public static double convertToCentimeters (int feet, int inches){
        int totalHeight = (feet * 12) + inches;
        double convertedHeight = convertToCentimeters(totalHeight);
        return convertedHeight;
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6, 0));
        System.out.println(convertToCentimeters(3, 24));
        System.out.println(convertToCentimeters(412));
        System.out.println(convertToCentimeters(32));
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(68));
    }
}
