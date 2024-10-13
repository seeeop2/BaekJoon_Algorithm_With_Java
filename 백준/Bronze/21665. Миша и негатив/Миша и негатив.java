import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] dimensions = br.readLine().split(" ");
        int height = Integer.parseInt(dimensions[0]);
        int width = Integer.parseInt(dimensions[1]);

        char[][] firstPic = new char[height][width];

        for (int i = 0; i < height; i++) {
            firstPic[i] = br.readLine().toCharArray();
        }

        br.readLine();

        int incorrectCount = 0;

        for (int i = 0; i < height; i++) {
            char[] secondPicRow = br.readLine().toCharArray();
            for (int j = 0; j < width; j++) {
                if (firstPic[i][j] == secondPicRow[j]) {
                    incorrectCount++;
                }
            }
        }

        bw.write(String.valueOf(incorrectCount));

        bw.flush();
        br.close();
        bw.close();
    }
}
