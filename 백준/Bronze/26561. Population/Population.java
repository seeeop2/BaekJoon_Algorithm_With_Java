import java.io.*;

public class Main {
    private static final int DEATH_INTERVAL = 7;
    private static final int BIRTH_INTERVAL = 4;

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfTestCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfTestCases; i++) {
            String[] input = br.readLine().split(" ");
            int initialPopulation = Integer.parseInt(input[0]);
            int elapsedTime = Integer.parseInt(input[1]);

            int deaths = elapsedTime / DEATH_INTERVAL;
            int births = elapsedTime / BIRTH_INTERVAL;

            int finalPopulation = initialPopulation - deaths + births;
            bw.write(finalPopulation + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
