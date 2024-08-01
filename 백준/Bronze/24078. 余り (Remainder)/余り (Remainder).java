import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int number = 21;
        int x = Integer.parseInt(br.readLine());
        int remainder = x % number;

        bw.write(String.valueOf(remainder));
        bw.flush();
        bw.close();
    }
}
