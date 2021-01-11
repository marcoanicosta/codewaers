package code;
import java.util.Arrays;

public class SmashWords {

    public static String smash(String... words) {
        String output = "";


        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1){
                output += words[i];
            } else {
                output += words[i] + " ";
            }
        }

        return output;
    }
}