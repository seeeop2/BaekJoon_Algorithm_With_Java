import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        int w = inputList.get(0);
        int h = inputList.get(1);

        double area = w * h * 0.5;
        String areaToString = String.format("%.1f", area);

        bw.write(areaToString);

        bw.flush();
        bw.close();
    }
}
