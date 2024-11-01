import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int chickenCount = Integer.parseInt(br.readLine());
        String[] preferences = br.readLine().split(" ");

        int friedPreference = Integer.parseInt(preferences[0]);
        int soyPreference = Integer.parseInt(preferences[1]);
        int yangnyeomPreference = Integer.parseInt(preferences[2]);

        int totalSatisfied = Math.min(friedPreference, chickenCount)
                + Math.min(soyPreference, chickenCount)
                + Math.min(yangnyeomPreference, chickenCount);

        bw.write(String.valueOf(totalSatisfied));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
