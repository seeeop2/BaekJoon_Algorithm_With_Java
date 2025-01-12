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
        String characters = br.readLine();
        int totalStrokes = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = characters.charAt(i);
            switch (currentChar) {
                case 'j':
                case 'i':
                    totalStrokes += 2;
                    break;
                case 'o':
                    totalStrokes += 1;
                    break;
            }
        }

        bw.write(Integer.toString(totalStrokes));
        bw.flush();
        bw.close();
        br.close();
    }
}
