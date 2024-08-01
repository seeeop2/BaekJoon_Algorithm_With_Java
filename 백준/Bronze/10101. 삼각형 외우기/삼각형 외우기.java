import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int angle1 = Integer.parseInt(br.readLine());
        int angle2 = Integer.parseInt(br.readLine());
        int angle3 = Integer.parseInt(br.readLine());
        String typeOfTriangle;

        if (angle1 == 60 && angle2 == 60 && angle3 == 60){
            typeOfTriangle = "Equilateral";
        } else if (angle1 + angle2 + angle3 == 180){
            if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3){
                typeOfTriangle = "Isosceles";
            } else{
                typeOfTriangle = "Scalene";
            }
        } else {
            typeOfTriangle = "Error";
        }

        bw.write(typeOfTriangle);

        bw.flush();
        br.close();
        bw.close();
    }
}
