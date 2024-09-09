import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int totalScoreA = 0;
        int totalScoreB = 0;

        for (int i = 0; i < input.length(); i += 2) {
            char team = input.charAt(i);
            int score = Character.getNumericValue(input.charAt(i + 1));

            if (team == 'A') {
                totalScoreA += score;
            } else if (team == 'B') {
                totalScoreB += score;
            }
        }

        String result = (totalScoreA > totalScoreB) ? "A" : "B";
        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }
}
