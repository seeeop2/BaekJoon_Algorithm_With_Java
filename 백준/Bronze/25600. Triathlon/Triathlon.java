import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfSets = Integer.parseInt(br.readLine());
        int maxScore = Integer.MIN_VALUE;

        for (int i = 0; i < numberOfSets; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int d = Integer.parseInt(input[1]);
            int g = Integer.parseInt(input[2]);

            int totalScore = a * (d + g);

            if (a == (d + g)) {
                totalScore *= 2;
            }
            maxScore = Math.max(maxScore, totalScore);
        }

        bw.write(String.valueOf(maxScore));

        bw.flush();
        bw.close();
        br.close();
    }
}
