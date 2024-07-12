import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            bw.write("Case #" + i +": " + inputList.get(0));
            bw.newLine();
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}
