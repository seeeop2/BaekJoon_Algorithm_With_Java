import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final String TEXT = "DKSH";
        String input = br.readLine();
        int length = input.length();
        int textLength = TEXT.length();
        int count = 0;

        for (int i = 0; i <= length - textLength; i++) {
            if (input.startsWith(TEXT, i)) {
                count++;
            }
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
