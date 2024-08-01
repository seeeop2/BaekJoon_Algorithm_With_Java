import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String[] strArr = br.readLine().split(" ");

        long firstLong = Long.parseLong(strArr[0]);
        long secondLong = Long.parseLong(strArr[1]);

        long result = Math.abs( firstLong - secondLong);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
