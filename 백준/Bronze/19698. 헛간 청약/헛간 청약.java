import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int numberOfCows = Integer.parseInt(inputs[0]);
        int barnWidth = Integer.parseInt(inputs[1]);
        int barnHeight = Integer.parseInt(inputs[2]);
        int spacePerCow = Integer.parseInt(inputs[3]);

        int countInWidth = barnWidth / spacePerCow;
        int countInHeight = barnHeight / spacePerCow;

        int totalSpaces = countInWidth * countInHeight;

        int maxCowsInBarn = Math.min(numberOfCows, totalSpaces);

        bw.write(String.valueOf(maxCowsInBarn));
        bw.flush();
        br.close();
        bw.close();
    }
}
