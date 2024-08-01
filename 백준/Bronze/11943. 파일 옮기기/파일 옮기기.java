import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> basket1 = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> basket2 = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int applesInBasket1 = basket1.get(0);
        int orangesInBasket1 = basket1.get(1);
        int applesInBasket2 = basket2.get(0);
        int orangesInBasket2 = basket2.get(1);

        int moveCase1 = applesInBasket1 + orangesInBasket2;
        int moveCase2 = orangesInBasket1 + applesInBasket2;

        int minimumMoves = Math.min(moveCase1, moveCase2);

        bw.write(String.valueOf(minimumMoves));

        bw.flush();
        br.close();
        bw.close();
    }
}
