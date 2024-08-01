import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int numberOfCase = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < numberOfCase ; i++){
            List<Long> list = Arrays.stream(br.readLine().split(" ")).map(it -> Long.parseLong(it)).collect(Collectors.toList());
            long lengthOfTelecomParisTech  = list.get(0);
            long widthOfTelecomParisTech  = list.get(1);
            long lengthOfEurecom  = list.get(2);
            long widthOfEurecom = list.get(3);
            long areaOfTelecomParisTech = lengthOfTelecomParisTech * widthOfTelecomParisTech;
            long areaOfEurecom = lengthOfEurecom * widthOfEurecom;

            if (areaOfTelecomParisTech > areaOfEurecom){
                bw.write("TelecomParisTech");
            } else if(areaOfEurecom > areaOfTelecomParisTech){
                bw.write("Eurecom");
            } else if ( areaOfEurecom == areaOfTelecomParisTech){
                bw.write("Tie");
            }

            if(i != numberOfCase - 1){
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
