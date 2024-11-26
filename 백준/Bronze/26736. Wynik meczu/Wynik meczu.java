import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int countA = 0;
        int countB = 0;

        char[] inputChars = br.readLine().toCharArray();

        for (char currentChar : inputChars) {
            if (currentChar == 'A') {
                countA++;
            } else if (currentChar == 'B') {
                countB++;
            }
        }

        bw.write(countA + " : " + countB);

        bw.flush();
        bw.close();
        br.close();
    }
}
