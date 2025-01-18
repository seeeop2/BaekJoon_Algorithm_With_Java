import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstCloneScores = br.readLine();
        String secondCloneScores = br.readLine();

        StringBuilder combinedScores = new StringBuilder();

        for (int i = 0; i < firstCloneScores.length(); i++) {
            char maxScore = (char) Math.max(firstCloneScores.charAt(i), secondCloneScores.charAt(i));
            combinedScores.append(maxScore);
        }

        bw.write(combinedScores.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

