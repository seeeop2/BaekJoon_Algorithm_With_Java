import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int input = Integer.parseInt(br.readLine());
        String grade = "";

        if (90 <= input && input <= 100){
            grade = "A";
        } else if(80 <= input && input <= 89){
            grade = "B";
        } else if (70 <= input && input <= 79){
            grade = "C";
        } else if(60 <= input && input <= 69){
            grade = "D";
        } else{
            grade = "F";
        }

        bw.write(grade);

        bw.flush();
        bw.close();
    }
}
