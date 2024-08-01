import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());

        int coin = 100;
        int numberOfCoin = inputList.get(0);
        int priceOfCandyBar = inputList.get(1);

        if (coin * numberOfCoin >= priceOfCandyBar){
            bw.write("Yes");
        }
        else{
            bw.write("No");
        }

        bw.flush();
        bw.close();
    }
}
