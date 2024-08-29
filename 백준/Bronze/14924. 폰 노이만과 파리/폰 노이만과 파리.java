import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int speed = Integer.parseInt(input[0]);
        int time = Integer.parseInt(input[1]);
        int distance = Integer.parseInt(input[2]);

        int meetTime = distance / (speed * 2);
        int totalDistance = meetTime * time;

        bw.write(String.valueOf(totalDistance));

        bw.flush();
        br.close();
        bw.close();
    }
}
