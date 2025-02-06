import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int totalPeriods = Integer.parseInt(firstLine[0]);
        int reservedPeriod = Integer.parseInt(firstLine[1]);

        int numberOfStudents = Integer.parseInt(br.readLine());
        boolean allStudentsCanAttend = true;

        for (int i = 0; i < numberOfStudents; i++) {
            int availableCount = Integer.parseInt(br.readLine());
            boolean canAttend = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .anyMatch(period -> period == reservedPeriod);

            if (!canAttend) {
                allStudentsCanAttend = false;
                break;
            }
        }

        bw.write(allStudentsCanAttend ? "YES" : "NO");
        bw.flush();
        bw.close();
        br.close();
    }
}
