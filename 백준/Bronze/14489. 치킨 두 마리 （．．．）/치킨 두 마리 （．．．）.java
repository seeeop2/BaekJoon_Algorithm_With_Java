import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> balances = Arrays.stream(br.readLine()
                                        .split(" "))
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toList());
        int chickenPrice = Integer.parseInt(br.readLine());

        int totalBalance = balances.get(0) + balances.get(1);
        int remainingBalance = totalBalance >= chickenPrice * 2 ? totalBalance - chickenPrice * 2 : totalBalance;

        bw.write(String.valueOf(remainingBalance));

        bw.flush();
        br.close();
        bw.close();
    }
}
