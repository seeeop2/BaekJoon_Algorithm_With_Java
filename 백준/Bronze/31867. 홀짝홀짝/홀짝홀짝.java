import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String k = br.readLine();

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            int digit = k.charAt(i) - '0';
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int result = (evenCount > oddCount) ? 0 : (oddCount > evenCount) ? 1 : -1;

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}
