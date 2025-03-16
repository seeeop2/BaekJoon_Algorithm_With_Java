import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int totalPlugs = 0;

        for (int i = 0; i < N; i++) {
            int plugs = Integer.parseInt(br.readLine());
            totalPlugs += plugs;
        }

        int maxComputers = totalPlugs - (N - 1);

        bw.write(Integer.toString(maxComputers));
        bw.flush();
        bw.close();
        br.close();

    }
}
