import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Character> characters = new ArrayList<>(Arrays.asList('l', 'k', 'p'));

        for (int i = 0; i < 3; i++) {
            String input = br.readLine();
            char firstChar = input.charAt(0);
            if (characters.contains(firstChar)) characters.remove(Character.valueOf(firstChar));
        }

        if (characters.isEmpty()) {
            bw.write("GLOBAL");
        } else {
            bw.write("PONIX");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
