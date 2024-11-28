import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int numberOfFriends = Integer.parseInt(br.readLine());
        String[] friendsTracks = br.readLine().split(" ");
        String helloBitTrack = br.readLine();

        int matchingCount = 0;
        for (String track : friendsTracks) {
            if (track.equals(helloBitTrack)) {
                matchingCount++;
            }
        }

        bw.write(matchingCount + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
