import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final double ADVANTAGE = 1.5;
        final int CHARIOT_SCORE = 13;
        final int CANNON_SCORE = 7;
        final int HORSE_SCORE = 5;
        final int ELEPHANT_SCORE = 3;
        final int GUARD_SCORE = 3;
        final int PAWN_SCORE = 2;

        String[] chogiPieces = br.readLine().split(" ");
        String[] hangukPieces = br.readLine().split(" ");

        int chogiScore =
            Integer.parseInt(chogiPieces[0]) * CHARIOT_SCORE +
            Integer.parseInt(chogiPieces[1]) * CANNON_SCORE +
            Integer.parseInt(chogiPieces[2]) * HORSE_SCORE +
            Integer.parseInt(chogiPieces[3]) * ELEPHANT_SCORE +
            Integer.parseInt(chogiPieces[4]) * GUARD_SCORE +
            Integer.parseInt(chogiPieces[5]) * PAWN_SCORE;

        double hangukScore =
            Integer.parseInt(hangukPieces[0]) * CHARIOT_SCORE +
            Integer.parseInt(hangukPieces[1]) * CANNON_SCORE +
            Integer.parseInt(hangukPieces[2]) * HORSE_SCORE +
            Integer.parseInt(hangukPieces[3]) * ELEPHANT_SCORE +
            Integer.parseInt(hangukPieces[4]) * GUARD_SCORE +
            Integer.parseInt(hangukPieces[5]) * PAWN_SCORE +
            ADVANTAGE;

        String winner = chogiScore > hangukScore ? "cocjr0208" : "ekwoo";

        bw.write(winner);
        bw.flush();
        bw.close();
        br.close();
    }
}
