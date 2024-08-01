import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int drinkWithSushiOrNotLunch = 280;
        int noDrinkWithSushiDuringLunch = 320;
        String mealTime = "";

        List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        int time = inputList.get(0);
        int drinkOrNot = inputList.get(1);

        if(time <= 11){
            mealTime = "Breakfast";
        }
        else if(12 <= time && time <= 16){
            mealTime = "Lunch";
        }
        else if(17 <= time && time <=23){
            mealTime = "Dinner";
        }

        if (mealTime == "Lunch" && drinkOrNot == 0){
            bw.write(String.valueOf(noDrinkWithSushiDuringLunch));
        }
        else{
            bw.write(String.valueOf(drinkWithSushiOrNotLunch));
        }

        bw.flush();
        bw.close();
    }
}
