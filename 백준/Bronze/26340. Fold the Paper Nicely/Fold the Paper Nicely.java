import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n^2)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfDataSets = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfDataSets; i++) {
            String input = br.readLine();
            String[] dimensions = input.split(" ");
            int width = Integer.parseInt(dimensions[0]);
            int height = Integer.parseInt(dimensions[1]);
            int numberOfFolds = Integer.parseInt(dimensions[2]);

            for (int j = 0; j < numberOfFolds; j++) {
                if (width > height) {
                    width /= 2;
                } else {
                    height /= 2;
                }
            }
            int finalWidth = Math.max(width, height);
            int finalHeight = Math.min(width, height);
            bw.write(String.format("Data set: %s\n%d %d\n\n", input, finalWidth, finalHeight));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
