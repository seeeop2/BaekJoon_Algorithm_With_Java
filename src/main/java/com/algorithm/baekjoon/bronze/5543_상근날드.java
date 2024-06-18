import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<Integer> burgers = new ArrayList<>();
        List<Integer> beverages = new ArrayList<>();

        for (int i = 0 ; i < 3 ; i++){
            burgers.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0 ; i < 2 ; i++){
            beverages.add(Integer.parseInt(br.readLine()));
        }


        int lowestMeal = 999999999;

        for (int i = 0 ; i < burgers.size() ; i++){

            for (int j = 0 ; j < beverages.size() ; j++){
                int priceOfMeal = burgers.get(i) + beverages.get(j) - 50;

                if (lowestMeal > priceOfMeal){
                    lowestMeal = priceOfMeal;
                }
            }
        }

        bw.write(String.valueOf(lowestMeal));

        bw.flush();
        bw.close();
    }
}
