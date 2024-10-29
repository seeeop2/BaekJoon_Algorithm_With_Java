import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        int latestDeparture = -1;

        for (int i = 0; i < N; i++) {
            String[] busInfo = br.readLine().split(" ");
            int S = Integer.parseInt(busInfo[0]);
            int T = Integer.parseInt(busInfo[1]);

            if (S + T <= X) {
                if (latestDeparture < S) {
                    latestDeparture = S;
                }
            }
        }

        bw.write(String.valueOf(latestDeparture));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
