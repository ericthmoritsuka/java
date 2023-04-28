public class primitiveTypes2 {
    public static void main(String[] args){
        //we use floating point numbers when we need more precision in calculations.
        //float and double do that in java. The first is a single precision number (occupies 32 bits) and the second is a double precision number (occupies 64 bits).

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + minFloatValue);
        System.out.println("Float maximum value = " + maxFloatValue);
        System.out.println();

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + minDoubleValue);
        System.out.println("Double maximum value = " + maxDoubleValue);
        System.out.println();

        int intValue = 5;
        float floatValue = 5f;
        double doubleValue = 5d;

        // int intValue1 = 5;
        //float floatValue1 = 5.25; we get an error here because the program sees it as a double value.
        // double doubleValue1 = 5.25;

        // int intValue2 = 5;
        // float floatValue2 = (float)(5.25); //casting
        // double doubleValue2 = 5.25;

        System.out.println("intValue: " + intValue);
        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println();

        int intValue3 = 5 / 2;
        float floatValue3 = 5f / 2f;
        double doubleValue3 = 5d / 2d;

        System.out.println("intValue3: " + intValue3);
        System.out.println("floatValue3: " + floatValue3);
        System.out.println("doubleValue3: " + doubleValue3);
        System.out.println();

        int intValue4 = 5 / 3;
        float floatValue4 = 5f / 3f; // less precision
        double doubleValue4 = 5d / 3d; //more precision

        System.out.println("intValue4: " + intValue4);
        System.out.println("floatValue4: " + floatValue4);
        System.out.println("doubleValue4: " + doubleValue4);
        System.out.println();

        int intValue5 = 5 / 3;
        float floatValue5 = 5f / 3f; //it needs the literal (f)
        double doubleValue5 = 5.00 / 3.00; //no need for literal (d)

        System.out.println("intValue5: " + intValue5);
        System.out.println("floatValue5: " + floatValue5);
        System.out.println("doubleValue5: " + doubleValue5);
        System.out.println();

        double pi = 3.1415927d;
        double number = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(number);
        System.out.println();

        //challenge
        System.out.println("Challenge: ");
        double pounds = 200d;
        double kg = pounds * 0.45359237d;
        System.out.println("pounds: " + pounds);
        System.out.println("kg: " + kg);

        //BigDecimal is better with big calculations that require more precise numbers.
        //We generally do not use float. We generally use double instead.
    }
    
}
