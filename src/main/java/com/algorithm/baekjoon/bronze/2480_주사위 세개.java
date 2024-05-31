import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int result = 0;

        if(a==b && a==c && b==c){
            result = 10000 + a * 1000;
        } else if(a!=b && a==c && b!=c ){
            result = 1000 + a * 100;
        } else if(a==b && a!=c && b!=c){
            result = 1000 + b * 100;
        }else if(a!=b && a!=c && b==c){
            result = 1000 + c * 100;
        } else if(a!=b && a!=c && b!=c){
            if(a>b && a>c){
                result = a * 100;
            }else if(b>a && b>c){
                result = b * 100;
            }else if(c>a && c>b){
                result = c * 100;
            }
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
