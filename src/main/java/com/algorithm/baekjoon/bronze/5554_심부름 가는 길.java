import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int totalSeconds = 0;

        for (int i = 0 ; i < 4 ; i++){
            totalSeconds += Integer.parseInt(br.readLine());
        }

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        bw.write(String.valueOf(minutes));
        bw.newLine();
        bw.write(String.valueOf(seconds));

        bw.flush();
        bw.close();
    }
}
