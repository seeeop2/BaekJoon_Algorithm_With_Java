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
        char[] charArray = br.readLine().toCharArray();
        boolean isAllCharactersEqual = true;

        for (int i = 0; i < n - 1; i++) {
            if (charArray[i] != charArray[i + 1]) {
                isAllCharactersEqual = false;
                break;
            }
        }

        bw.write(isAllCharactersEqual ? "Yes" : "No");
        bw.flush();
        bw.close();
        br.close();
    }
}
