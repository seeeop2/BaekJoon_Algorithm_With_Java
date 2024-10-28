import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int SEMINAR_COUNT = 7;
        String seminarWithMaxParticipants = "";
        int maxParticipants = Integer.MIN_VALUE;

        for (int i = 0; i < SEMINAR_COUNT; i++) {
            String[] input = br.readLine().split(" ");
            int participants = Integer.parseInt(input[1]);

            if (participants > maxParticipants) {
                maxParticipants = participants;
                seminarWithMaxParticipants = input[0];
            }
        }

        bw.write(seminarWithMaxParticipants);
        bw.flush();
        br.close();
        bw.close();
    }
}
