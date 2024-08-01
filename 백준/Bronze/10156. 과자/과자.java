import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int priceOfSnack = list.get(0);
        int wantAmountOfSnack = list.get(1);
        int currentAmountOfMoney = list.get(2);
        int totalCost = priceOfSnack * wantAmountOfSnack;
        int needMoney = totalCost > currentAmountOfMoney ? totalCost - currentAmountOfMoney : 0 ;

        bw.write(String.valueOf(needMoney));

        bw.flush();
        br.close();
        bw.close();
    }
}
