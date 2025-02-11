import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0 ; i < 3 ; i++){
            int n = Integer.parseInt(br.readLine());
            BigInteger totalSum = BigInteger.ZERO;
            
            for (int j = 0 ; j < n ; j++){
                totalSum = totalSum.add(new BigInteger(br.readLine()));
            }

            String result = totalSum.compareTo(BigInteger.ZERO) == 1 ? "+"
                    : totalSum.compareTo(BigInteger.ZERO) == -1 ? "-"
                    : "0";
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}