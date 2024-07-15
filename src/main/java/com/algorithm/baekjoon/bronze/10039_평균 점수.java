import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfStudent = 5;
        int totalGrade = 0;

        for (int i = 0 ; i < numberOfStudent ; i++){
            int grade = Integer.parseInt(br.readLine());

            if (grade < 40){
                grade = 40;
            }
            totalGrade += grade;
        }

        int average = totalGrade / numberOfStudent;

        bw.write(String.valueOf(average));

        bw.flush();
        br.close();
        bw.close();
    }
}
