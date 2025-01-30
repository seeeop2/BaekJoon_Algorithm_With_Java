import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numHearts = Integer.parseInt(br.readLine());

        String[] heartLines = {
                " @@@   @@@ ",
                "@   @ @   @",
                "@    @    @",
                "@         @",
                " @       @ ",
                "  @     @  ",
                "   @   @   ",
                "    @ @    ",
                "     @     "
        };

        for (int i = 0; i < heartLines.length; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < numHearts; j++) {
                line.append(heartLines[i]);
                if (j < numHearts - 1) {
                    line.append(" ");
                }
            }
            bw.write(line.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
