import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int boundaryCells = m == 1 ? n
                :  n == 1 ? m
                : (m + n) * 2 - 4;

        bw.write(Integer.toString(boundaryCells));
        bw.flush();
        bw.close();
        br.close();
    }
}
