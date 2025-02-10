import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] callTimes = br.readLine().split(" ");

        int totalY = 0;
        int totalM = 0;

        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(callTimes[i]);
            totalY += (t / 30 + 1) * 10;
            totalM += (t / 60 + 1) * 15;
        }

        String result = totalY < totalM ? "Y " + totalY
                : totalY > totalM ? "M " + totalM
                : "Y M " + totalY;

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
