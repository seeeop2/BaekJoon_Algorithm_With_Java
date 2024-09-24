import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long area = Long.parseLong(br.readLine());

        double radius = Math.sqrt(area / Math.PI);
        double fenceLength = 2 * Math.PI * radius;

        String formattedOutput = String.format("%.6f", fenceLength);
        bw.write(formattedOutput);

        bw.flush();
        br.close();
        bw.close();
    }
}
