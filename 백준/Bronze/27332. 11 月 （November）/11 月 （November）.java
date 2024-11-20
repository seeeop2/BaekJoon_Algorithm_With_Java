import java.io.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int dayOfMonth = Integer.parseInt(br.readLine());
        int weeksLater = Integer.parseInt(br.readLine());

        LocalDate initialDate = LocalDate.of(2022, 11, dayOfMonth);
        LocalDate dateAfterWeeks = initialDate.plusWeeks(weeksLater);
        int month = dateAfterWeeks.getMonthValue();

        String result = month == 11 ? "1" : "0";
        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
