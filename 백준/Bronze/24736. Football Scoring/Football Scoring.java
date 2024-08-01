import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int visitingTeamScore = 0;
        int homeTeamScore = 0;

        int touchDown = 6;
        int fieldGoal = 3;
        int Safety = 2;
        int pointAfter = 1;
        int twoPointConversion = 2;
        List<Integer> scoreList = Arrays.asList(touchDown, fieldGoal, Safety, pointAfter, twoPointConversion);

        List<Integer> boxScoreForVisitingTeam = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        List<Integer> boxScoreForHomeTeam = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());

        for (int i = 0 ; i < scoreList.size() ; i++){
            visitingTeamScore += boxScoreForVisitingTeam.get(i) * scoreList.get(i);
            homeTeamScore += boxScoreForHomeTeam.get(i) * scoreList.get(i);
        }

        bw.write(visitingTeamScore + " " + homeTeamScore);

        bw.flush();
        bw.close();
    }
}
