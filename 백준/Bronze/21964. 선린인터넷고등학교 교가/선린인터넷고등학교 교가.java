import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int SUBSTRING_LENGTH = 5;

        int index = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String output = input.substring(index - SUBSTRING_LENGTH);

        bw.write(output);

        bw.flush();
        br.close();
        bw.close();
    }
}
