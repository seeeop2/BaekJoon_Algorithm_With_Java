import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] numbers = {
                {"0000", "   1", "2222", "3333", "4  4", "5555", "6666", "7777", "8888", "9999"},
                {"0  0", "   1", "   2", "   3", "4  4", "5", "6", "   7", "8  8", "9  9"},
                {"0  0", "   1", "2222", "3333", "4444", "5555", "6666", "   7", "8888", "9999"},
                {"0  0", "   1", "2", "   3", "   4", "   5", "6  6", "   7", "8  8", "   9"},
                {"0000", "   1", "2222", "3333", "   4", "5555", "6666", "   7", "8888", "   9"}
        };

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - '0';

            for (String[] number : numbers) {
                String line = number[digit];
                bw.write(line);
                bw.newLine();
            }

            if (i < input.length() - 1) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
