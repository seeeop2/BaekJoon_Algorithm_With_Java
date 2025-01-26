import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n^2)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] dimensions = br.readLine().split(" ");
        int height = Integer.parseInt(dimensions[0]);
        int width = Integer.parseInt(dimensions[1]);

        int countZero = 0;
        int countOne = 0;

        for (int i = 0; i < height; i++) {
            String[] row = br.readLine().split("");
            for (int j = 0; j < width; j++) {
                if (row[j].equals("0")) {
                    countZero++;
                } else {
                    countOne++;
                }
            }
        }

        int minSwitches = Math.min(countZero, countOne);

        bw.write(Integer.toString(minSwitches));
        bw.flush();
        bw.close();
        br.close();
    }
}
