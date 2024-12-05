import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int length = Integer.parseInt(input[0]);
        int width = Integer.parseInt(input[1]);
        
        int areaInSquareYards = length * width;
        double areaInAcres = areaInSquareYards / 4840.0;
        int bagsNeeded = (int) Math.ceil(areaInAcres / 5);

        bw.write(Integer.toString(bagsNeeded));
        bw.flush();
        bw.close();
        br.close();
    }
}
