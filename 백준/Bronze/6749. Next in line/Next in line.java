import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int youngest = Integer.parseInt(br.readLine());
        int middle = Integer.parseInt(br.readLine());
        int diff = middle - youngest;
        int oldest = middle + diff;

        bw.write(String.valueOf(oldest));

        bw.flush();
        bw.close();
    }
}
