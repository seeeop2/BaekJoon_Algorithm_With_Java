import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int numberOfStudents = 28;
        int regularBox = 8;
        int smallBox = 3;

        int numberOfRegualrBox = Integer.parseInt(br.readLine());
        int numberOfSmallBox = Integer.parseInt(br.readLine());

        int totalCupcakes = numberOfRegualrBox * regularBox + numberOfSmallBox * smallBox;
        if (totalCupcakes < 28){
            throw new RuntimeException("need more cupcakes");
        }
        int remainder = totalCupcakes - numberOfStudents;

        bw.write(String.valueOf(remainder));
        bw.flush();
        bw.close();
    }
}
