package Section5.src;

//challenge -> this is the correct answer

public class OverloadedMethods2v2 {
    public static String getDurationString(int seconds){
        if (seconds < 0) { //validation
            System.out.println("The number of seconds must be 0 or more than 0");
            return "";
        } else {

            int minutes = seconds/60;
            int finalSeconds = seconds%60;
            String duration = getDurationString(minutes, finalSeconds);
            return duration;
        }
    }

    public static String getDurationString (int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59) { //validation
            System.out.println("Invalid inputs. Use a positive value for minutes and 0-59 seconds.");
            return "";
        } else {

            int hours = minutes/60;
            if (hours > 23) {
                int days = hours/24;
                int finalHours = hours%24;
                int finalMinutes = minutes%60;
                String duration = String.format("%02dd %02dh %02dm %02ds", days, finalHours, finalMinutes, seconds);
                return duration;

            } else {
                int finalMinutes = minutes%60;
                String duration = String.format("%02dh %02dm %02ds", hours, finalMinutes, seconds);
                return duration;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(3666));
        System.out.println(getDurationString(366));
        System.out.println(getDurationString(36));
        System.out.println(getDurationString(33, 51));
        System.out.println(getDurationString(56, 12));
        System.out.println(getDurationString(51231512));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(0, 0));

        System.out.println(getDurationString(0, 1242));
        System.out.println(getDurationString(-123));
        System.out.println(getDurationString(-123, 12));
        System.out.println(getDurationString(23, 62));
        System.out.println(getDurationString(23, -12));
    }
}
