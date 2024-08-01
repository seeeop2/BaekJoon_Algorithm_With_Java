import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);

        boolean checkRightAngledTriangle = Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2);
        boolean checkEquilateralTriangle = a == b && b == c;
        int output = 0;

        if (checkEquilateralTriangle){
            output = 2;
        }
        else if(checkRightAngledTriangle){
            output = 1;
        }
        else{
            output = 0;
        }

        bw.write(String.valueOf(output));

        bw.flush();
        br.close();
        bw.close();
    }
}
