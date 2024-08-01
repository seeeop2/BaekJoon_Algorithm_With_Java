import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int height = Integer.parseInt(br.readLine());
        int width = Integer.parseInt(br.readLine());

        int area = height * width;

        bw.write(String.valueOf(area));

        bw.flush();
        bw.close();
    }
}
