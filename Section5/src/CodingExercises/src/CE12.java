package Section5.src.CodingExercises.src;

public class CE12 {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (!summer) {
            if(temperature >= 25 && temperature <= 35) {
                return true;
            }
        } else {
            if(temperature >= 25 && temperature <= 45) {
                return true;
            }
        }
        return false;
    }
}
