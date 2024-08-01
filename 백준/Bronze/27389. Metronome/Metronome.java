import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double metronome = 4.0;
        double input = Double.parseDouble(br.readLine());
        double output = input / metronome;

        bw.write(String.valueOf(output));

        bw.flush();
        bw.close();
    }
}
