import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
        double pi = 3.141592;

        double totalLength  = 2 * d1 + (2 * d2 * pi);

        bw.write(String.valueOf(totalLength));

        bw.flush();
        br.close();
        bw.close();
    }
}