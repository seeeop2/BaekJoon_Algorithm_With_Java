import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int numberOfCandidates = Integer.parseInt(input[0]);
        int numberOfCommittees = Integer.parseInt(input[1]);

        int count = 0;

        for (int i = 0; i < numberOfCandidates; i++) {
            String opinions = br.readLine();
            int yesOpinions = 0;

            for (char opinion : opinions.toCharArray()) {
                if (opinion == 'O') {
                    yesOpinions++;
                }
            }
            if (yesOpinions > numberOfCommittees / 2) {
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
