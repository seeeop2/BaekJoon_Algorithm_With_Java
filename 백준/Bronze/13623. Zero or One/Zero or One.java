import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        String alice = list[0];
        String beto = list[1];
        String clara = list[2];
        String result ="";

        if (alice.equals(beto) && alice.equals(clara)) {
            result = "*";
        } else if (alice.equals(clara)) {
            result = "B";
        } else if (alice.equals(beto)) {
            result = "C";
        } else{
            result = "A";
        }

        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }
}
