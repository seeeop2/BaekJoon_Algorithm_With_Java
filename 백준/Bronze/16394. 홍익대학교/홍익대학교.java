import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openingOfHongik = 1946;
        int input = scanner.nextInt();
        int gap = input - openingOfHongik;

        System.out.println(gap);
    }
}
