import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int suspectCount = Integer.parseInt(br.readLine());
        String culprit = "";

        for (int i = 0; i < suspectCount; i++) {
            String suspectName = br.readLine();

            if (suspectName.contains("S")){
                culprit = suspectName;
                break;
            }
        }

        bw.write(culprit + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
