import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int input = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < input ; i++){
            List<String> collect = Arrays.stream(br.readLine().split("")).collect(Collectors.toList());
            bw.write(collect.get(0)+collect.get(collect.size()-1));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
