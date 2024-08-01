import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<Integer> minguk = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        List<Integer> mansae = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());

        int totalGradeOfMinguk = 0;
        int totalGradeOfMansae = 0;

        for (int grade : minguk){
            totalGradeOfMinguk += grade;
        }
        for (int grade : mansae){
            totalGradeOfMansae += grade;
        }

        if (totalGradeOfMinguk >= totalGradeOfMansae){
            bw.write(String.valueOf(totalGradeOfMinguk));
        }
        else{
            bw.write(String.valueOf(totalGradeOfMansae));
        }

        bw.flush();
        bw.close();
    }
}
