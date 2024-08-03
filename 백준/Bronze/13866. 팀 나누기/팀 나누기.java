import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] scores = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(scores);

        int teamAScore = scores[0] + scores[3];
        int teamBScore = scores[1] + scores[2];
        
        int scoreDifference = Math.abs(teamAScore - teamBScore);

        bw.write(String.valueOf(scoreDifference));

        bw.flush();
        br.close();
        bw.close();
    }
}
