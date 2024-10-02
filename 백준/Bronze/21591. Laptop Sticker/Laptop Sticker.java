import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int laptopWidth = Integer.parseInt(input[0]);
        int laptopHeight = Integer.parseInt(input[1]);
        int stickerWidth = Integer.parseInt(input[2]);
        int stickerHeight = Integer.parseInt(input[3]);

        int availableWidth = laptopWidth - 2;
        int availableHeight = laptopHeight - 2;

        String result = (stickerWidth <= availableWidth && stickerHeight <= availableHeight) ? "1" : "0";

        bw.write(result);
        
        bw.flush();
        br.close();
        bw.close();
    }
}
