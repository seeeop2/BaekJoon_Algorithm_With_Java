import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine();
        char previousChar = '\0';

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar != previousChar) {
                bw.write(currentChar);
                previousChar = currentChar;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
