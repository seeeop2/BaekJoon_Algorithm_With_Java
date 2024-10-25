import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);

        int praiseOnionLength = 1;
        int blameOnionLength = 1;

        for (int day = 1; day <= N; day++) {
            praiseOnionLength += A;
            blameOnionLength += B;

            if (praiseOnionLength < blameOnionLength) {
                int temp = praiseOnionLength;

                praiseOnionLength = blameOnionLength;
                blameOnionLength = temp;
            } else if (praiseOnionLength == blameOnionLength) {
                blameOnionLength -= 1;
            }
        }

        bw.write(praiseOnionLength + " " + blameOnionLength);
        bw.flush();
        bw.close();
        br.close();
    }
}
