import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());

        Integer siteScore = scoreCalculator(list);

        bw.write(siteScore.toString());

        bw.flush();
        bw.close();
    }

    public static int scoreCalculator(List<Integer> partOfScore){
        List<Integer> coefficients = Arrays.asList(56, 24, 14, 6);

        int firstCoefficients = coefficients.get(0);
        int secondCoefficients = coefficients.get(1);
        int thirdCoefficients = coefficients.get(2);
        int fourthCoefficients = coefficients.get(3);

        int firstVariable = partOfScore.get(0);
        int secondVariable = partOfScore.get(1);
        int thirdVariable = partOfScore.get(2);
        int fourthVariable = partOfScore.get(3);

        int formula = firstCoefficients * firstVariable +
                    secondCoefficients * secondVariable +
                    thirdCoefficients * thirdVariable +
                    fourthCoefficients * fourthVariable;
        return formula;
    }
}
