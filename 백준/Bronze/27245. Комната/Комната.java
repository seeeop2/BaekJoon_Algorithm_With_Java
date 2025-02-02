import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int width = Integer.parseInt(br.readLine());
        int length = Integer.parseInt(br.readLine());
        int height = Integer.parseInt(br.readLine());

        int maxDimension = Math.max(width, length);
        int minDimension = Math.min(width, length);

        boolean isHeightRatioValid = (minDimension / (double) height) >= 2;
        boolean isDimensionRatioValid = (maxDimension / (double) minDimension) <= 2;

        String result = isHeightRatioValid && isDimensionRatioValid ? "good" : "bad";

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
