import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputArray = br.readLine().split(" ");
        long length = Long.parseLong(inputArray[0]);
        long width = Long.parseLong(inputArray[1]);
        long totalArea = length * width;

        long maxTiles = totalArea / 2;

        bw.write(String.valueOf(maxTiles));

        bw.flush();
        br.close();
        bw.close();
    }
}
