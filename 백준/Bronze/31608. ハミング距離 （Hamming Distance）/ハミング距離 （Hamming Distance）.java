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
        String firstString = br.readLine();
        String secondString = br.readLine();

        int hammingDistance = 0;

        for (int i = 0; i < length; i++) {
            char charFromFirst = firstString.charAt(i);
            char charFromSecond = secondString.charAt(i);
            if (charFromFirst != charFromSecond) {
                hammingDistance++;
            }
        }

        bw.write(String.valueOf(hammingDistance));
        bw.flush();
        bw.close();
        br.close();
    }
}
