import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<Integer> cakeA = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        List<Integer> cakeC = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());

        List<Integer> cakeB = findCakeB(cakeA, cakeC);

        for (int intList : cakeB) {
            bw.write(intList + " ");
        }

        bw.flush();
        bw.close();
    }
    public static List<Integer> findCakeB(List<Integer> cakeA, List<Integer> cakeC){
        List<Integer> cakeB = new ArrayList<>();

        int xOfCakeA = cakeA.get(0);
        int yOfCakeA = cakeA.get(1);
        int zOfCakeA = cakeA.get(2);

        int xOfCakeC = cakeC.get(0);
        int yOfCakeC = cakeC.get(1);
        int zOfCakeC = cakeC.get(2);

        int xOfCakeB = xOfCakeC - zOfCakeA;
        int yOfCakeB = yOfCakeC / yOfCakeA;
        int zOfCakeB = zOfCakeC - xOfCakeA;

        cakeB.add(xOfCakeB);
        cakeB.add(yOfCakeB);
        cakeB.add(zOfCakeB);

        return cakeB;
    }
}
