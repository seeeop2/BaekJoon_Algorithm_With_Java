import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double area = Double.parseDouble(br.readLine());
        double sideLength = Math.sqrt(area);
        double perimeter = sideLength * 4;

        if (perimeter % 1 == 0) {
            bw.write(String.format("%.1f", perimeter));
        } else {
            bw.write(String.format("%.8f", perimeter));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
