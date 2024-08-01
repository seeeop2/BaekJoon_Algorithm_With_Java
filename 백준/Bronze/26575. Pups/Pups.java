import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < loop ; i++){
            List<Double> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Double.parseDouble(it)).collect(Collectors.toList());
            double numberOfDogs = inputList.get(0);
            double amountOfEachDog = inputList.get(1);
            double priceOfFood = inputList.get(2);
            double needMoney = numberOfDogs * amountOfEachDog * priceOfFood;
            String formattedNeedMoney = String.format("%.2f", needMoney);

            bw.write("$"+formattedNeedMoney);

            if (i != loop -1){
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
