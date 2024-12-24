import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String original = "SciComLove";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        String result = (n % 2 == 0) ? original : reversed;

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
