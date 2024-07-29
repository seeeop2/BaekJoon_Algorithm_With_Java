import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> positions = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> applePositions = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int applePosition = applePositions.get(0);

        int personIndex = positions.indexOf(applePosition);
        int result = (personIndex != -1) ? personIndex + 1 : 0;

        bw.write(String.valueOf(result));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
