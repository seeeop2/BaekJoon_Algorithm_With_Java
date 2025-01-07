import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[10];
        int totalSum = 0;

        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            totalSum += numbers[i];
        }

        for (int i = 0; i < 10; i++) {
            int hiddenSum = totalSum - numbers[i];
            if (hiddenSum == numbers[i]) {
                bw.write(Integer.toString(numbers[i]));
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
