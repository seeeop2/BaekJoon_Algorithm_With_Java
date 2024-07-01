import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());

        double bmi = weight/(height*height);
        String message;

        if (bmi>25){
            message = "Overweight";
        }
        else if(18.5 <= bmi && bmi <=25.0){
            message = "Normal weight";
        }
        else{
            message = "Underweight";
        }

        bw.write(message);
        bw.flush();
        bw.close();
    }
}
