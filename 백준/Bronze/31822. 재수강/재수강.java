import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String retakeCourseCode = br.readLine();
        int n = Integer.parseInt(br.readLine());

        String retakePrefix = retakeCourseCode.substring(0, 5);
        int count = 0;

        for (int i = 0; i < n; i++) {
            String availableCourseCode = br.readLine();
            String availablePrefix = availableCourseCode.substring(0, 5);

            if (retakePrefix.equals(availablePrefix)) {
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
