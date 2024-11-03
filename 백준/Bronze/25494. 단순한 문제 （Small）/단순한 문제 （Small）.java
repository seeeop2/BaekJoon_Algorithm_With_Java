import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            int count = 0;

            for (int x = 1; x <= a; x++) {
                for (int y = 1; y <= b; y++) {
                    for (int z = 1; z <= c; z++) {
                        if (x % y == y % z && y % z == z % x) {
                            count++;
                        }
                    }
                }
            }
            bw.write(count + "\n");
        }

        bw.flush();
        br.close();
    }
}
