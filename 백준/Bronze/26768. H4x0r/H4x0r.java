import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, Character> charToHackerMap = new HashMap<>();
        charToHackerMap.put('a', '4');
        charToHackerMap.put('e', '3');
        charToHackerMap.put('i', '1');
        charToHackerMap.put('o', '0');
        charToHackerMap.put('s', '5');

        String inputString = br.readLine();

        String hackerSlang = inputString.chars()
                .mapToObj(c -> charToHackerMap.getOrDefault((char) c, (char) c))
                .map(String::valueOf)
                .collect(Collectors.joining());

        bw.write(hackerSlang);

        bw.flush();
        bw.close();
        br.close();
    }
}
