public class primitiveTypes1 {

    public static void main(String[] args){
        int value = 10000;
        System.out.println();

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("value: " + value);
        System.out.println("Integer: 32 bits");
        System.out.println("Integer minimum value: " + minIntValue);
        System.out.println("Integer maximum value: " + maxIntValue);
        System.out.println("Overflow (maxIntValue +1): " + (maxIntValue +
        1));
        System.out.println("Underflow (minIntValue -1): " + (minIntValue -
        1));
        System.out.println();

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte: 8 bits");
        System.out.println("Byte minimum value: " + minByteValue);
        System.out.println("Byte maximum value: " + maxByteValue);
        System.out.println();

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short: 16 bits");
        System.out.println("Short minimum value: " + minShortValue);
        System.out.println("Short maximum value: " + maxShortValue);
        System.out.println();

        long longValue = 100L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long: 64 bits");
        System.out.println("Long Value: " + longValue);
        System.out.println("Long minimum value: " + minLongValue);
        System.out.println("Long maximum value: " + maxLongValue);
        System.out.println();

        int total = maxIntValue / 2;
        byte totalByte =  (byte)(maxByteValue / 2); //casting
        short totalShort =  (short)(maxShortValue / 2); //casting

        System.out.println(total);
        System.out.println(totalByte);
        System.out.println(totalShort);

        //challenge
        byte challengeByte = 16;
        short challengeShort = 64;
        int challengeInt = 10;
        long challengeLong = 50000L + 10L*(challengeByte + challengeInt + challengeShort);
        System.out.println("challengeLong => " + challengeLong);
    }

}
