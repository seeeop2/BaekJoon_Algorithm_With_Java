import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int SIZE_OF_SMALL_TREATS = 1;
        final int SIZE_OF_MEDIUM_TREATS = 2;
        final int SIZE_OF_LARGE_TREATS = 3;

        int countSmallTreats = Integer.parseInt(br.readLine());
        int countMediumTreats = Integer.parseInt(br.readLine());
        int countLargeTreats = Integer.parseInt(br.readLine());

        int totalScore = countSmallTreats * SIZE_OF_SMALL_TREATS 
                       + countMediumTreats * SIZE_OF_MEDIUM_TREATS 
                       + countLargeTreats * SIZE_OF_LARGE_TREATS;

        String result = totalScore >= 10 ? "happy" : "sad";

        bw.write(result);
        bw.flush();
        br.close();
        bw.close();
    }
}
