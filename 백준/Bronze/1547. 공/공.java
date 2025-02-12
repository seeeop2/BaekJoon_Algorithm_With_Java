import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int swapCount = Integer.parseInt(br.readLine());
        int ballPosition = 1;

        for (int i = 0; i < swapCount; i++) {
            String[] input = br.readLine().split(" ");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);

            if (ballPosition == X) {
                ballPosition = Y;
            } else if (ballPosition == Y) {
                ballPosition = X;
            }
        }

        bw.write(Integer.toString(ballPosition));
        bw.flush();
        bw.close();
        br.close();
    }
}
