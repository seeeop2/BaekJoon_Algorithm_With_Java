import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputValues = br.readLine().split(" ");
        int valueX = Integer.parseInt(inputValues[0]);
        int boundaryLeft = Integer.parseInt(inputValues[1]);
        int boundaryRight = Integer.parseInt(inputValues[2]);
        int closestValue;

        if (boundaryLeft <= valueX && valueX <= boundaryRight) {
            closestValue = valueX;
        } else {
            int distanceToLeft = Math.abs(valueX - boundaryLeft);
            int distanceToRight = Math.abs(boundaryRight - valueX);
            closestValue = distanceToLeft >= distanceToRight ? boundaryRight : boundaryLeft;
        }

        bw.write(String.valueOf(closestValue));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
