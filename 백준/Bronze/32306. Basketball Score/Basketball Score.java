import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int POINT_ONE   = 1;
        final int POINT_TWO   = 2;
        final int POINT_THREE = 3;

        List<Integer> team1Scores = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> team2Scores = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int team1TotalScore = team1Scores.get(0) * POINT_ONE  + team1Scores.get(1) * POINT_TWO + team1Scores.get(2) * POINT_THREE;
        int team2TotalScore = team2Scores.get(0) * POINT_ONE  + team2Scores.get(1) * POINT_TWO + team2Scores.get(2) * POINT_THREE;

        String winner = team1TotalScore == team2TotalScore ? "0" : team1TotalScore > team2TotalScore ? "1" : "2";

        bw.write(winner);

        bw.flush();
        br.close();
        bw.close();
    }
}
