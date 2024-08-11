import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> birthDate = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> currentDate = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int birthYear = birthDate.get(0);
        int birthMonth = birthDate.get(1);
        int birthDay = birthDate.get(2);

        int currentYear = currentDate.get(0);
        int currentMonth = currentDate.get(1);
        int currentDay = currentDate.get(2);

        // 만 나이
        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        // 세는 나이
        int koreanAge = currentYear - birthYear + 1;

        // 연 나이
        int yearAge = currentYear - birthYear;

        bw.write(age+"\n");
        bw.write(koreanAge+"\n");
        bw.write(yearAge+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}