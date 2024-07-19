import java.io.*;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        String formattedDateOfInput = String.format("%02d-%02d", month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");

        MonthDay specialDay = MonthDay.parse("02-18",formatter);
        MonthDay today = MonthDay.parse(formattedDateOfInput,formatter);

        if (today.isBefore(specialDay)){
            bw.write("Before");
        } else if(today.isAfter(specialDay)){
            bw.write("After");
        } else {
            bw.write("Special");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
