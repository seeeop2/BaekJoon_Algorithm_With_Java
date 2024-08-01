import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int x = Integer.parseInt(br.readLine());
        int volume = (int) Math.pow(x, 3);

        bw.write(String.valueOf(volume));
        bw.flush();
        bw.close();
    }
}
