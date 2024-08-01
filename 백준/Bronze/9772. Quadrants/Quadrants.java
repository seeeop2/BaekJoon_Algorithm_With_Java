import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            List<Double> list = Arrays.stream(br.readLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
            double x = list.get(0);
            double y = list.get(1);

            if (x == 0 && y == 0) {
                bw.write("AXIS\n");
                break;
            }

            String point;
            if (x > 0) {
                if (y > 0) {
                    point = "Q1";
                } else if (y < 0) {
                    point = "Q4";
                } else {
                    point = "AXIS";
                }
            } else if (x < 0) {
                if (y > 0) {
                    point = "Q2";
                } else if (y < 0) {
                    point = "Q3";
                } else {
                    point = "AXIS";
                }
            } else {
                point = "AXIS";
            }

            bw.write(point + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
