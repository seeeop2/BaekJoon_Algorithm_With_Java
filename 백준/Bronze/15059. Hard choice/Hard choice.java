import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] availableMealsInput = br.readLine().split(" ");
        String[] requestedMealsInput = br.readLine().split(" ");

        int currentUnmatched = 0;
        int totalUnmatchedMeals = 0;

        for (int i = 0; i < availableMealsInput.length; i++) {
            if ((currentUnmatched = Integer.parseInt(requestedMealsInput[i]) - Integer.parseInt(availableMealsInput[i])) > 0) {
                totalUnmatchedMeals += currentUnmatched;
            }
        }

        bw.write(String.valueOf(totalUnmatchedMeals));

        bw.flush();
        br.close();
        bw.close();
    }
}
