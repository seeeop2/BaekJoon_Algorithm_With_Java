import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if (a > b){
                continue;
            } else {
                minimum = Math.min(minimum, b);
            }
        }

        if (minimum == Integer.MAX_VALUE) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(minimum));
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
