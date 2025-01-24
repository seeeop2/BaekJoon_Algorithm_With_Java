import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final String FIVE_MARK = "++++";
        final String SINGLE_VOTE_MARK = "|";

        int candidateCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < candidateCount; i++) {
            int votesReceived = Integer.parseInt(br.readLine());
            int groupsOfFive = votesReceived / 5;
            int remainingVotes = votesReceived % 5;

            StringBuilder resultSb = new StringBuilder();

            for (int j = 0; j < groupsOfFive; j++) {
                resultSb.append(FIVE_MARK)
                        .append(" ");
            }

            for (int j = 0; j < remainingVotes; j++) {
                resultSb.append(SINGLE_VOTE_MARK);
            }

            String result = resultSb.toString().trim();
            bw.write(result);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
