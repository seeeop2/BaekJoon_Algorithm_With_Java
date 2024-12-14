import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalMilk = Integer.parseInt(br.readLine());
        int pouringTime = Integer.parseInt(br.readLine());
        int milkDifference = Math.abs(totalMilk - pouringTime * 2);

        bw.write(Integer.toString(milkDifference));

        bw.flush();
        bw.close();
        br.close();
    }
}
