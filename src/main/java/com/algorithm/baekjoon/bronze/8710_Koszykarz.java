import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int k = list.get(0);
        int w = list.get(1);
        int m = list.get(2);

        int needMoreHeight = w - k;
        int count = needMoreHeight / m;

        if (needMoreHeight % m != 0) {
            count ++;
        }
        bw.write(String.valueOf(count));

        bw.flush();
        br.close();
        bw.close();
    }
}
