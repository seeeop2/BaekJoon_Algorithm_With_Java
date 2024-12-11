import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lionVotes = 0;
        int tigerVotes = 0;

        for (int i = 0 ; i < 9 ; i++){
            String vote = br.readLine().trim();
            if (vote.equals("Lion")) {
                lionVotes++;
            } else if (vote.equals("Tiger")) {
                tigerVotes++;
            }
        }

        String king = lionVotes >= 5 ? "Lion" : "Tiger" ;
        bw.write(king);

        bw.flush();
        bw.close();
        br.close();
    }
}
