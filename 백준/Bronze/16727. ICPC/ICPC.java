import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 경기 점수 (Persepolis vs Esteghlal)
        String[] firstMatchScores = br.readLine().split(" ");
        // 두 번째 경기 점수 (Esteghlal vs Persepolis)
        String[] secondMatchScores = br.readLine().split(" ");

        // (홈) Persepolis의 첫 번째 경기 점수
        int persepolisScoreFirstMatch = Integer.parseInt(firstMatchScores[0]);
        // (원정) Esteghlal의 첫 번째 경기 점수
        int esteghlalScoreFirstMatch = Integer.parseInt(firstMatchScores[1]);
        // (홈) Esteghlal의 두 번째 경기 점수
        int esteghlalScoreSecondMatch = Integer.parseInt(secondMatchScores[0]);
        // (원정) Persepolis의 두 번째 경기 점수
        int persepolisScoreSecondMatch = Integer.parseInt(secondMatchScores[1]);

        // 총 점수 계산
        int totalScorePersepolis = persepolisScoreFirstMatch + persepolisScoreSecondMatch;
        int totalScoreEsteghlal = esteghlalScoreFirstMatch + esteghlalScoreSecondMatch;

        String result;

        // 총 점수 비교
        if (totalScorePersepolis == totalScoreEsteghlal) {
            if (persepolisScoreSecondMatch > esteghlalScoreFirstMatch) {
                result = "Persepolis";
            } else if (persepolisScoreSecondMatch < esteghlalScoreFirstMatch) {
                result = "Esteghlal";
            } else {
                result = "Penalty";
            }
        } else if (totalScorePersepolis > totalScoreEsteghlal) {
            result = "Persepolis";
        } else {
            result = "Esteghlal";
        }

        bw.write(result);
        
        bw.flush();
        br.close();
        bw.close();
    }
}
