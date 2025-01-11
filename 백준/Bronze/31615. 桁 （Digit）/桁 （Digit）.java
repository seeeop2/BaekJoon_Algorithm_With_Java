import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstNumber = Integer.parseInt(br.readLine());
        int secondNumber = Integer.parseInt(br.readLine());
        int sum = firstNumber + secondNumber;
        int digitCount = Integer.toString(sum).length();

        bw.write(Integer.toString(digitCount));
        bw.flush();
        bw.close();
        br.close();
    }
}
