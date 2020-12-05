package testing;

public class TotalPoints {

    public static int points(String[] games) {
        int total = 0;

        for (int i =0; i < games.length; i++){
            String[] score = games[i].split(":");
            int x = Integer.parseInt(score[0]); // 004
            int y = Integer.parseInt(score[1]); // 034556


            if (x > y) {
                total += 3;
            } else if (x<y) {
                total += 0;
            } else {
                total += 1;
            }
        } return total;
    }
}