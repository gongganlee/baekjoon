import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int X = sc.nextInt(), N = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= N; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            total += a * b;
        }

        if (X == total)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}
