import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { //1~N행
            for (int j = 0; j < n-i-1; j++) { //공백의 개수
                System.out.print(" "); //공백 찍고
            }
            for (int k = 0; k <= i; k++) { //별의 개수
                System.out.print("*"); //별 찍고
            }
            System.out.println(); //개행
        }
        sc.close();
    }
}