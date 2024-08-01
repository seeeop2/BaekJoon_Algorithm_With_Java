import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        Double gravityOfMoon = 0.167;

        while (true){

            double input = Double.parseDouble(br.readLine());

            if (input < 0){
                break;
            }

            String weightInTheEarth = String.format("%.2f",input);
            String weightInTheMoon = String.format("%.2f", input * gravityOfMoon );

            bw.write("Objects weighing " + weightInTheEarth + " on Earth will weigh " + weightInTheMoon + " on the moon.\n");
        }

        bw.flush();
        bw.close();
    }
}
