import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, Boolean> requiredCharsMap = new HashMap<>();
        requiredCharsMap.put('M',false);
        requiredCharsMap.put('O',false);
        requiredCharsMap.put('B',false);
        requiredCharsMap.put('I',false);
        requiredCharsMap.put('S',false);

        char[] charArray = br.readLine().toCharArray();
        for (char currentChar : charArray) {
            switch (currentChar) {
                case 'M':
                case 'O':
                case 'B':
                case 'I':
                case 'S':
                    requiredCharsMap.replace(currentChar, true); break;
            }
        }

        String result = requiredCharsMap.containsValue(false) ? "NO" : "YES";
        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}
