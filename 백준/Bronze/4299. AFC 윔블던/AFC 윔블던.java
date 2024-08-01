import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        int addition = inputList.get(0);
        int subtraction = inputList.get(1);

        if(subtraction > addition){
            bw.write("-1");
        }
        else{
            int scoreOfTeamA = (addition + subtraction) / 2;
            int scoreOfTeamB = (addition - subtraction) / 2;

            if (scoreOfTeamA + scoreOfTeamB == addition && scoreOfTeamA - scoreOfTeamB == subtraction){
                bw.write(scoreOfTeamA + " " + scoreOfTeamB);
            }
            else{
                bw.write("-1");
            }
        }

        bw.flush();
        bw.close();
    }
}
