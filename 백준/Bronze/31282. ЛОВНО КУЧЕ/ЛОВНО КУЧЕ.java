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
        int initialDistance = Integer.parseInt(inputs[0]);
        int rabbitJumpDistance = Integer.parseInt(inputs[1]);
        int dogJumpDistance = Integer.parseInt(inputs[2]);

        int jumpsNeeded = (int) Math.ceil((double) initialDistance / (dogJumpDistance - rabbitJumpDistance));

        bw.write(Integer.toString(jumpsNeeded));
        bw.flush();
        bw.close();
        br.close();
    }
}
