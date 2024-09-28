import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long sumOfCubes = 0;

        for (int i = 1; i <= n; i++) {
            sumOfCubes += (long) Math.pow(i, 3);
        }
        
        bw.write(String.valueOf(sumOfCubes));

        bw.flush();
        br.close();
        bw.close();
    }
}
