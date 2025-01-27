import java.io.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LocalDate contestDate = LocalDate.of(2023, 10, 21);
        LocalDate limitDate = contestDate.minusDays(35);

        String inputDateString = br.readLine();
        LocalDate inputDate = LocalDate.parse(inputDateString);

        String outputMessage = inputDate.isBefore(limitDate) || inputDate.isEqual(limitDate) ? "GOOD" : "TOO LATE";

        bw.write(outputMessage);
        bw.flush();
        bw.close();
        br.close();
    }
}
