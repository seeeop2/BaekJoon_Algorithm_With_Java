import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    // 시간 복잡도: O(n)
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxNumber = Integer.parseInt(br.readLine());

        for (int currentNumber = 1; currentNumber <= maxNumber; currentNumber++) {
            if (currentNumber % 7 == 0 && currentNumber % 11 == 0) {
                bw.write("Wiwat!\n");
            } else if (currentNumber % 7 == 0) {
                bw.write("Hurra!\n");
            } else if (currentNumber % 11 == 0) {
                bw.write("Super!\n");
            } else {
                bw.write(currentNumber + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
