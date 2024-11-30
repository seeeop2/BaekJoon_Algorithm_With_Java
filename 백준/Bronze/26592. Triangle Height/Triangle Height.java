import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfTriangles = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfTriangles; i++) {
            String[] triangleInputs = br.readLine().split(" ");
            double area = Double.parseDouble(triangleInputs[0]);
            double baseLength = Double.parseDouble(triangleInputs[1]);
            double height = (area * 2) / baseLength;
            String message = String.format("The height of the triangle is %.2f units\n", height);
            bw.write(message);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
