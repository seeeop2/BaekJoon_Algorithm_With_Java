import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine();
        String outputResult;

        switch (inputString) {
            case "fdsajkl;":
            case "jkl;fdsa":
                outputResult = "in-out";
                break;
            case "asdf;lkj":
            case ";lkjasdf":
                outputResult = "out-in";
                break;
            case "asdfjkl;":
                outputResult = "stairs";
                break;
            case ";lkjfdsa":
                outputResult = "reverse";
                break;
            default:
                outputResult = "molu";
        }

        bw.write(outputResult);

        bw.flush();
        bw.close();
        br.close();
    }
}
