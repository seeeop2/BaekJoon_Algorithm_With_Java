import java.io.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int endedDay = inputList.get(0);
        int endedHH = inputList.get(1);
        int endedMM = inputList.get(2);

        LocalDateTime startedLocalDateTime = LocalDateTime.of(2011, 11, 11, 11, 11);
        LocalDateTime endedLocalDateTime = LocalDateTime.of(2011, 11, endedDay, endedHH, endedMM);

        Duration diff = Duration.between(startedLocalDateTime, endedLocalDateTime);
        long diffMinutes = diff.toMinutes();

        if (diffMinutes < 0){
            bw.write("-1");
        }
        else {
            bw.write(String.valueOf(diffMinutes));
        }

        bw.flush();
        bw.close();
    }
}
