import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        char[] characters = br.readLine().toCharArray();

        for (int i = 0; i < length - 1; i++) {
            if (characters[i + 1] == 'J') {
                bw.write(characters[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
