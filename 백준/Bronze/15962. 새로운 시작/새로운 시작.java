import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String message = "파이팅!!";

        bw.write(message);

        bw.flush();
        bw.close();
    }
}
