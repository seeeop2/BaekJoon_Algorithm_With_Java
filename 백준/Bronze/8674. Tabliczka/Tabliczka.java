import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Long> list = Arrays.stream(br.readLine().split(" ")).map(Long::parseLong).sorted().collect(Collectors.toList());
        long a = list.get(0);
        long b = list.get(1);

        long remainder = 0;

        if ( !(a % 2 == 0 || b % 2 == 0)){
            remainder = a;
        }

        bw.write(String.valueOf(remainder));

        bw.flush();
        br.close();
        bw.close();
    }
}
