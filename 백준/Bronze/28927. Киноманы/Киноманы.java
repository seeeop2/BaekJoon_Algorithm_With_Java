import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int runningTimeOfTrailer = 3;
        int runningTimeOfSeries = 20;
        int runningTimeOfMovie = 120;

        List<Integer> informationOfMax = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        List<Integer> informationOfMel = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());

        int totalTimeOfMax =
                        runningTimeOfTrailer * informationOfMax.get(0) +
                        runningTimeOfSeries * informationOfMax.get(1) +
                        runningTimeOfMovie * informationOfMax.get(2);
        int totalTimeOfMel =
                        runningTimeOfTrailer * informationOfMel.get(0) +
                        runningTimeOfSeries * informationOfMel.get(1) +
                        runningTimeOfMovie * informationOfMel.get(2);

        if (totalTimeOfMax > totalTimeOfMel){
            bw.write("Max");
        }
        else if( totalTimeOfMel > totalTimeOfMax){
            bw.write("Mel");
        }
        else{
            bw.write("Draw");
        }

        bw.flush();
        bw.close();
    }
}
