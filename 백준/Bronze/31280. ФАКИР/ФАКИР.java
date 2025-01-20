import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int grayMice = Integer.parseInt(inputs[0]);
        int whiteMice = Integer.parseInt(inputs[1]);
        int blackMice = Integer.parseInt(inputs[2]);
        int spottedMice = Integer.parseInt(inputs[3]);

        int minMiceCount = Math.min(Math.min(grayMice, whiteMice), Math.min(blackMice, spottedMice));
        int totalMice = grayMice + whiteMice + blackMice + spottedMice;
        int minimumMiceToExtract = totalMice - minMiceCount + 1;

        bw.write(Integer.toString(minimumMiceToExtract));
        bw.flush();
        bw.close();
        br.close();
    }
}