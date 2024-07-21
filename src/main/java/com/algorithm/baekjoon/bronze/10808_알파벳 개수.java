import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = br.readLine().chars().boxed().collect(Collectors.toList());

        for (int i = 97; i <= 122; i++) {
            int charCount = 0;
            
            for (int j : list) {
                if (j == i) {
                    charCount++;
                }
            }
            
            bw.write(charCount + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
