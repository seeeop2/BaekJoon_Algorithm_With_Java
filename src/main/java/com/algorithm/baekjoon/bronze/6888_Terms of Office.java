import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = {4, 2, 3, 5};
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int lcm = lcm(numbers);

        for (int i = a ; i <= b ; i += lcm){
            bw.write("All positions change in year " + i);
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }

    // 여러 개의 수의 최소공배수 구하기
    public static int lcm(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }

    // 두 수의 최소공배수 구하기
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    // 최대공약수 구하기 (유클리드 호제법)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
