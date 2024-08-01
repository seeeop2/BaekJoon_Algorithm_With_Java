import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String BusDriver = "비와이";
        List<Integer> firstInput = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        int numberOfBusStopsExceptStartingAndLastStation = firstInput.get(0);
        int numberOfPassengersGetOnBusAtStartingStation = firstInput.get(1);

        for (int i = 0 ; i < numberOfBusStopsExceptStartingAndLastStation ; i++){
            br.readLine();
        }
      
        bw.write(BusDriver);
        bw.flush();
        bw.close();
    }
}
