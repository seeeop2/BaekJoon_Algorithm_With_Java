import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfRectangles = Integer.parseInt(br.readLine());
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < numberOfRectangles; i++) {
            String[] dimensions = br.readLine().split(" ");
            int width = Integer.parseInt(dimensions[0]);
            int height = Integer.parseInt(dimensions[1]);
            int area = width * height;
            maxArea = Math.max(maxArea, area);
        }

        bw.write(maxArea + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
