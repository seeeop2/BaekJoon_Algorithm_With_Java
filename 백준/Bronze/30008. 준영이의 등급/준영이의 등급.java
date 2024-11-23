import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputValues = br.readLine().split(" ");
        int studentCount = Integer.parseInt(inputValues[0]);

        List<Integer> ranks = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int rank: ranks){
            int percentage = findPercentage(rank, studentCount);

            String grade =  percentage > 96 ? "9" :
                            percentage > 89 ? "8" :
                            percentage > 77 ? "7" :
                            percentage > 60 ? "6" :
                            percentage > 40 ? "5" :
                            percentage > 23 ? "4" :
                            percentage > 11 ? "3" :
                            percentage > 4  ? "2" : "1";
            bw.write(grade + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
    public int findPercentage(int rank, int studentCount){
        return (rank * 100) / studentCount;
    }
}
