import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstInputs = br.readLine().split(" ");
        int totalSteps = Integer.parseInt(firstInputs[0]);
        int escalatorSpeed = Integer.parseInt(firstInputs[1]);
        int walkingSpeed = Integer.parseInt(firstInputs[2]);

        String[] secondInputs = br.readLine().split(" ");
        double A = Double.parseDouble(secondInputs[0]);
        double B = Double.parseDouble(secondInputs[1]);

        String[] thirdInputs = br.readLine().split(" ");
        int l = Integer.parseInt(thirdInputs[0]);
        int r = Integer.parseInt(thirdInputs[1]);

        double leftTime = (double) totalSteps / walkingSpeed + (l / A);
        double rightTime = (double) totalSteps / escalatorSpeed + (r / B);

        String result = leftTime < rightTime ? "friskus" : "latmask";

        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }
}
