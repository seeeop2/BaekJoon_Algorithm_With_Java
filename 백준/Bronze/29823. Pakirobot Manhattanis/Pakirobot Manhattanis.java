import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String directions = br.readLine();

        int northSouth = 0;
        int eastWest = 0;

        for (char dir : directions.toCharArray()) {
            if (dir == 'N') {
                northSouth++;
            } else if (dir == 'S') {
                northSouth--;
            } else if (dir == 'E') {
                eastWest++;
            } else if (dir == 'W') {
                eastWest--;
            }
        }

        int result = Math.abs(northSouth) + Math.abs(eastWest);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
