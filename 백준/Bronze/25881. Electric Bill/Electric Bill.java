import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int THRESHOLD_KWH = 1000;

        String[] rateInputs = br.readLine().split(" ");
        int rateForFirst1000KWH = Integer.parseInt(rateInputs[0]);
        int rateForAdditionalKWH = Integer.parseInt(rateInputs[1]);

        int numberOfCustomers = Integer.parseInt(br.readLine());
        for (int i = 0; i < numberOfCustomers; i++) {
            int consumption = Integer.parseInt(br.readLine());
            int totalAmount = consumption > THRESHOLD_KWH
                    ? rateForFirst1000KWH * THRESHOLD_KWH + rateForAdditionalKWH * (consumption - THRESHOLD_KWH)
                    : rateForFirst1000KWH * consumption;

            bw.write(String.format("%d %d\n", consumption, totalAmount));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
