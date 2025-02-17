import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            String[] throwsValues = br.readLine().split(" ");
            int countOfZeroes = 0;

            for (String value : throwsValues) {
                if (value.equals("0")) {
                    countOfZeroes++;
                }
            }

            String gameResult = "";

            switch (countOfZeroes) {
                case 0:
                    gameResult = "E";
                    break;
                case 1:
                    gameResult = "A";
                    break;
                case 2:
                    gameResult = "B";
                    break;
                case 3:
                    gameResult = "C";
                    break;
                case 4:
                    gameResult = "D";
                    break;
            }
            bw.write(gameResult + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
