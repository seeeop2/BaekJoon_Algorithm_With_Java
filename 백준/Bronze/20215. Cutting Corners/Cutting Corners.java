import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int rectangleWidth = Integer.parseInt(inputs[0]);
        int rectangleHeight = Integer.parseInt(inputs[1]);
        double diagonalLength = Math.sqrt(Math.pow(rectangleWidth, 2) + Math.pow(rectangleHeight, 2));

        double difference = (rectangleWidth + rectangleHeight) - diagonalLength;
        String formattedDifference;

        if (difference % 1 == 0) {
            formattedDifference = String.format("%.0f", difference);
        } else {
            formattedDifference = String.format("%.9f", difference);
        }
        
        bw.write(formattedDifference);

        bw.flush();
        br.close();
        bw.close();
    }
}
