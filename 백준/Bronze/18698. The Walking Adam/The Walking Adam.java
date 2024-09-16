import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfTestCases = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberOfTestCases; i++) {
            String stepsSequence = reader.readLine();
            int fallPosition = stepsSequence.indexOf('D');

            if (fallPosition == -1) {
                writer.write(stepsSequence.length() + "\n");
            } else {
                writer.write((fallPosition) + "\n");
            }
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
