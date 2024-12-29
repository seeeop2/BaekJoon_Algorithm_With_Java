import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int POINTS_PER_PACKAGE_DELIVERED = 50;
        final int POINTS_DEDUCTED_PER_COLLISION = -10;
        final int BONUS_POINTS_FOR_SUCCESS = 500;

        int numberOfPackagesDelivered = Integer.parseInt(br.readLine());
        int numberOfCollisions = Integer.parseInt(br.readLine());

        int scoreFromPackages = numberOfPackagesDelivered * POINTS_PER_PACKAGE_DELIVERED;
        int scoreFromCollisions = numberOfCollisions * POINTS_DEDUCTED_PER_COLLISION;

        int totalScore = (numberOfPackagesDelivered > numberOfCollisions)
                ? scoreFromPackages + scoreFromCollisions + BONUS_POINTS_FOR_SUCCESS
                : scoreFromPackages + scoreFromCollisions;

        bw.write(Integer.toString(totalScore));

        bw.flush();
        bw.close();
        br.close();
    }
}
