import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int worker = 3;

        for (int i = 0 ; i < worker ; i++){
            List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());

            Integer startedHH = inputList.get(0);
            Integer startedMM = inputList.get(1);
            Integer startedSS = inputList.get(2);
            Integer endedHH = inputList.get(3);
            Integer endedMM = inputList.get(4);
            Integer endedSS = inputList.get(5);

            int workingHH = 0;
            int workingMM = 0;
            int workingSS = 0;

            while (startedHH != endedHH || startedMM != endedMM || startedSS != endedSS){

                endedSS--;

                if (endedSS.equals(-1)){
                    endedMM--;
                    endedSS = 59;

                    if (endedMM.equals(-1)){
                        endedHH--;
                        endedMM = 59;
                    }

                }

                workingSS++;
            }

            workingHH = workingSS / 3600;
            workingMM = (workingSS % 3600) / 60 ;
            workingSS = (workingSS % 3600) % 60;

            bw.write(workingHH + " " + workingMM + " " + workingSS);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
