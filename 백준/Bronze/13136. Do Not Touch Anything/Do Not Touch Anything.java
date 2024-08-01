import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> inputs = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int rows = inputs.get(0);
        int columns = inputs.get(1);
        int cctvRange = inputs.get(2);

        int cctvsForRows = (rows % cctvRange == 0) ? rows / cctvRange : (rows / cctvRange) + 1;
        int cctvsForColumns = (columns % cctvRange == 0) ? columns / cctvRange : (columns / cctvRange) + 1;
        long totalCctvsNeeded = (long) cctvsForRows * cctvsForColumns;
       
        bw.write(String.valueOf(totalCctvsNeeded));

        bw.flush();
        br.close();
        bw.close();
    }
}
