import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfLevels = Integer.parseInt(br.readLine());
        String[] levelInputs = br.readLine().split(" ");

        for (int i = 0; i < numberOfLevels; i++) {
            int currentLevel = Integer.parseInt(levelInputs[i]);
            int levelCategory = currentLevel == 300 ? 1
                    : currentLevel >= 275 ? 2
                    : currentLevel >= 250 ? 3
                    : 4;
            bw.write(levelCategory + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
