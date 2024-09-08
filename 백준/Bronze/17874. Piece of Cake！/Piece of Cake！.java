import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        // 각 조각의 볼륨 계산
        int piece1Volume = calculateVolume(h, v);
        int piece2Volume = calculateVolume(h, n - v);
        int piece3Volume = calculateVolume(n - h, v);
        int piece4Volume = calculateVolume(n - h, n - v);

        // 최대 볼륨 찾기
        int maxVolume = Math.max(piece1Volume, Math.max(piece2Volume, Math.max(piece3Volume, piece4Volume)));

        bw.write(String.valueOf(maxVolume));

        bw.flush();
        br.close();
        bw.close();
    }

    private static int calculateVolume(int height, int width) {
        return height * width * 4;
    }

}
