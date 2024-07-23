import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double passingThreshold = 0.3;
        Map<String, Integer> maxScores = new HashMap<>();
        maxScores.put("Strategy", 35);
        maxScores.put("Management", 25);
        maxScores.put("Technology", 40);

        int numberOfStudents = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfStudents; i++) {
            List<Integer> scores = Arrays.stream(br.readLine().split(" "))
                                         .map(Integer::parseInt)
                                         .collect(Collectors.toList());
            
            int studentId = scores.get(0);
            int strategyScore = scores.get(1);
            int managementScore = scores.get(2);
            int technologyScore = scores.get(3);

            int totalScore = strategyScore + managementScore + technologyScore;
            String result = "PASS";

            if (strategyScore < maxScores.get("Strategy") * passingThreshold ||
                managementScore < maxScores.get("Management") * passingThreshold ||
                technologyScore < maxScores.get("Technology") * passingThreshold ||
                totalScore < 55) {
                result = "FAIL";
            }

            bw.write(studentId + " " + totalScore + " " + result);
            bw.newLine();
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}
