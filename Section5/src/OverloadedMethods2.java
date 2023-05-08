package Section5.src;

//challenge -> this is a test version. The correct answer is in OverloadedMethods2v2.java

public class OverloadedMethods2 {
    public static String getDurationString(int seconds){
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int finalSeconds = (seconds%3600)%60;

        String duration = String.format("%02dh %02dm %02ds", hours, minutes, finalSeconds);
        return duration;
    }

    public static String getDurationString (int minutes, int seconds){
        int newSeconds = (minutes * 60) + seconds;
        String answer = (getDurationString(newSeconds));
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(3666));
        System.out.println(getDurationString(366));
        System.out.println(getDurationString(36));
        System.out.println(getDurationString(33, 51));
        System.out.println(getDurationString(56, 12));

    }
}
