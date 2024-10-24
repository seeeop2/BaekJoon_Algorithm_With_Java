import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputSize = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(inputSize));
        bw.newLine();
        bw.write("1");

        bw.flush();
        br.close();
        bw.close();
    }
}
