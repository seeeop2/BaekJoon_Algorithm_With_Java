import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        int needTimeAsSs = Integer.parseInt(br.readLine());
        int hh = inputList.get(0);
        int mm = inputList.get(1);
        int ss = inputList.get(2);

        while (needTimeAsSs > 0){
            ss++;
            
            if (ss >= 60){
                mm++;
                ss = 0;
            }
            if(mm >= 60){
                hh++;
                mm = 0;
            }
            if(hh >= 24){
                hh = 0;
            }
            needTimeAsSs--;
        }

        bw.write(hh + " " + mm + " " + ss);

        bw.flush();
        bw.close();
    }
}
