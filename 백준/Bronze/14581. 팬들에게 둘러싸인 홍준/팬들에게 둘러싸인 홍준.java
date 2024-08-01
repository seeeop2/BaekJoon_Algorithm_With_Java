import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String id = br.readLine();

        bw.write(":fan::fan::fan:\n");
        bw.write(":fan::"+id+"::fan:\n");
        bw.write(":fan::fan::fan:");

        bw.flush();
        bw.close();
    }
}
