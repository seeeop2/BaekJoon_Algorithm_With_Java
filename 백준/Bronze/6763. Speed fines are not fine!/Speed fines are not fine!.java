import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int speedLimit = Integer.parseInt(br.readLine());
        int recordedSpeed = Integer.parseInt(br.readLine());
        int diffSpeed = recordedSpeed - speedLimit;
        int fine = 0;

        if(1 <= diffSpeed && diffSpeed <= 20) {
            fine = 100;
        }
        else if(21 <= diffSpeed && diffSpeed <= 30) {
            fine = 270;
        }
        else if(31 <= diffSpeed) {
            fine = 500;
        }
        else{
            bw.write("Congratulations, you are within the speed limit!");
            bw.flush();
            bw.close();
            return;
        }

        bw.write("You are speeding and your fine is $" + fine + ".");

        bw.flush();
        bw.close();
    }
}
