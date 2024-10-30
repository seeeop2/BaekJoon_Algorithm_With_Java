import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int ONE_WEEK = 3628800 / 6;

        int i = Integer.parseInt(br.readLine());
        long factorial = 1L;

        while (i > 0){
            factorial *= i;
            i--;
        }

        long result = factorial / ONE_WEEK;

        bw.write(Long.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
