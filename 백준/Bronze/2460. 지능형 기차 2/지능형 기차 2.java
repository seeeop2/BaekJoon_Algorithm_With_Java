import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int NUMBER_OF_STATIONS = 10;
        int currentPeople = 0;
        int maxPeople = 0;

        for (int i = 0; i < NUMBER_OF_STATIONS; i++) {
            String[] s = br.readLine().split(" ");
            int peopleOut = Integer.parseInt(s[0]);
            int peopleIn = Integer.parseInt(s[1]);
            currentPeople -= peopleOut;
            currentPeople += peopleIn;
            maxPeople = Math.max(maxPeople, currentPeople);
        }

        bw.write(Integer.toString(maxPeople));

        bw.flush();
        bw.close();
        br.close();
    }
}
