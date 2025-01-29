import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int numPatties = Integer.parseInt(inputs[0]);
        int numCheeses = Integer.parseInt(inputs[1]);

        int usableCheese = Math.min(numCheeses, numPatties - 1);
        int maxBurgerSize = 2 * usableCheese + 1;

        bw.write(Integer.toString(maxBurgerSize));
        bw.flush();
        bw.close();
        br.close();
    }
}
