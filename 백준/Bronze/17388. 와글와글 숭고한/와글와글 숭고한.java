import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] participationCounts = br.readLine().split(" ");
        int soongsilParticipation = Integer.parseInt(participationCounts[0]);
        int koreaParticipation = Integer.parseInt(participationCounts[1]);
        int hanyangParticipation = Integer.parseInt(participationCounts[2]);

        int totalParticipation = soongsilParticipation + koreaParticipation + hanyangParticipation;

        String universityWithLeastParticipation;

        if (totalParticipation >= 100) {
            universityWithLeastParticipation = "OK";
        } else {
            int minParticipation = Math.min(soongsilParticipation, Math.min(koreaParticipation, hanyangParticipation));

            if (minParticipation == soongsilParticipation) {
                universityWithLeastParticipation = "Soongsil";
            } else if (minParticipation == koreaParticipation) {
                universityWithLeastParticipation = "Korea";
            } else {
                universityWithLeastParticipation = "Hanyang";
            }
        }

        bw.write(universityWithLeastParticipation);
        bw.flush();
        br.close();
        bw.close();
    }
}
