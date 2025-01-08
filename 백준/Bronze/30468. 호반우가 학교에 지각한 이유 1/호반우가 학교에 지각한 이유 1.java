import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] stats = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int strength = stats[0];
        int dexterity = stats[1];
        int intelligence = stats[2];
        int luck = stats[3];
        int targetAverage = stats[4];

        int currentTotalStats = strength + dexterity + intelligence + luck;
        int requiredTotalStats = targetAverage * 4;

        int blessingsNeeded = Math.max(0, requiredTotalStats - currentTotalStats);

        bw.write(Integer.toString(blessingsNeeded));

        bw.flush();
        bw.close();
        br.close();
    }
}
