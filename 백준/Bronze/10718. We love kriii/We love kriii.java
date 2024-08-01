import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String message = "강한친구 대한육군\n" +
                        "강한친구 대한육군";

        bw.write(message);

        bw.flush();
        bw.close();
    }
}
