import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int countSameMbti = 0;

        String jinhoMbti = br.readLine();
        int numberOfFriends = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfFriends; i++) {
            String friendMbti = br.readLine().trim();
            if (friendMbti.equals(jinhoMbti)) {
                countSameMbti++;
            }
        }

        bw.write(Integer.toString(countSameMbti));
        bw.flush();
        bw.close();
        br.close();
    }
}
