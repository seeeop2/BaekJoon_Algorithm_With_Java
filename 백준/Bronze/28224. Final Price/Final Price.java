import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    // 시간 복잡도: O(n)
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfDays = Integer.parseInt(br.readLine());
        int finalPrice = Integer.parseInt(br.readLine());

        for (int i = 1; i < numberOfDays; i++) {
            int dailyPriceChange = Integer.parseInt(br.readLine());
            finalPrice += dailyPriceChange;
        }

        bw.write(Integer.toString(finalPrice));

        bw.flush();
        bw.close();
        br.close();
    }
}
