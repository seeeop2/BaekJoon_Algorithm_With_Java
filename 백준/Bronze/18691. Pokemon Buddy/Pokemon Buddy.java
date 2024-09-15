import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> candyPerGroup = new HashMap<>();
        candyPerGroup.put(1, 1);
        candyPerGroup.put(2, 3);
        candyPerGroup.put(3, 5);

        int numberOfTestCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfTestCases; i++) {
            String[] inputValues = br.readLine().split(" ");
            int group = Integer.parseInt(inputValues[0]);
            int currentCandies = Integer.parseInt(inputValues[1]);
            int requiredCandies = Integer.parseInt(inputValues[2]);
            int neededCandies = requiredCandies - currentCandies;

            if (neededCandies <= 0) {
                bw.write("0\n");
            } else {
                int neededKilometers = neededCandies * candyPerGroup.get(group);
                bw.write(neededKilometers + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
