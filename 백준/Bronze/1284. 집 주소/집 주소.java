import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String inputNumber = br.readLine();
            if (inputNumber.equals("0")) break;

            int totalWidth = 0;

            for (int i = 0; i < inputNumber.length(); i++) {
                switch (inputNumber.charAt(i)) {
                    case '1':
                        totalWidth += 2;
                        break;
                    case '0':
                        totalWidth += 4;
                        break;
                    default:
                        totalWidth += 3;
                        break;
                }
            }
            totalWidth += inputNumber.length() + 1;
            bw.write(totalWidth + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
