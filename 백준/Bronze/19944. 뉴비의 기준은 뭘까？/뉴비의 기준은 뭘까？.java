import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int standardOfOldBie = Integer.parseInt(inputs[0]);
        int currentGrade = Integer.parseInt(inputs[1]);
        String status;

        if (currentGrade <= 2) {
            status = "NEWBIE!";
        } else if (currentGrade <= standardOfOldBie) {
            status = "OLDBIE!";
        } else {
            status = "TLE!";
        }

        bw.write(status);
        
        bw.flush();
        br.close();
        bw.close();
    }
}
