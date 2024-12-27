import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] inputChars = br.readLine().toCharArray();

        int countWithoutY = 0;
        int countWithY = 0;

        for (char c : inputChars) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    countWithoutY++;
                    countWithY++;
                    break;
                case 'y':
                    countWithY++;
                    break;
            }
        }

        bw.write(countWithoutY + " " + countWithY);
        bw.flush();
        bw.close();
        br.close();
    }
}
