import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int playerAScore = Integer.parseInt(input[0]);
        int playerBScore = Integer.parseInt(input[1]);

        double scoreDifferenceFactor = (double) (playerBScore - playerAScore) / 400;
        double winProbability = 1 / (1 + Math.pow(10, scoreDifferenceFactor));

        bw.write(String.valueOf(winProbability));

        bw.flush();
        br.close();
        bw.close();
    }
}
