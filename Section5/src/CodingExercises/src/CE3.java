public class CE3 {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int conversionValue = 1024;
        int megaByte = kiloBytes/conversionValue;
        int remainder = kiloBytes % conversionValue;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainder + " KB");
        }
    }
}
