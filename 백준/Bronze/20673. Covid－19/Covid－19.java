import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int newCases = Integer.parseInt(br.readLine());
        int newHospitalizations = Integer.parseInt(br.readLine());

        String color;

        if (newHospitalizations > 30) {
            color = "Red";
        } else if (newCases <= 50 && newHospitalizations <= 10) {
            color = "White";
        } else {
            color = "Yellow";
        }

        bw.write(color);
        bw.flush();
        br.close();
        bw.close();
    }
}
