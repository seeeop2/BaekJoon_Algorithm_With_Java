import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCaseCount; i++) {
            String[] balloonColors = br.readLine().split("");
            long amberCount = Arrays.stream(balloonColors).filter(color -> color.equals("a")).count();
            long brassCount = Arrays.stream(balloonColors).filter(color -> color.equals("b")).count();
            long minFlips = Math.min(amberCount, brassCount);

            bw.write(Long.toString(minFlips));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
