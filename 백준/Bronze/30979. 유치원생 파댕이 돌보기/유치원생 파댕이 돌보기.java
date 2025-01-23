import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int requiredCareTime = Integer.parseInt(br.readLine());
        int candyCount = Integer.parseInt(br.readLine());
        String[] candyFlavorDurations = br.readLine().split(" ");

        int sum = 0;
        for (int i = 0; i < candyCount; i++) {
            sum += Integer.parseInt(candyFlavorDurations[i]);
        }

        String message = requiredCareTime > sum ? "Padaeng_i Cry" : "Padaeng_i Happy";

        bw.write(message);
        bw.flush();
        bw.close();
        br.close();
    }
}
