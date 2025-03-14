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
        int firstNumber = Integer.parseInt(inputs[0]);
        int secondNumber = Integer.parseInt(inputs[1]);
        int distance = Math.abs(((secondNumber - 1) / 4) - ((firstNumber - 1) / 4)) + Math.abs(((secondNumber - 1) % 4) - ((firstNumber - 1) % 4));

        bw.write(Integer.toString(distance));
        bw.flush();
        bw.close();
        br.close();
    }
}