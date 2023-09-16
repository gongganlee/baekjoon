import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int x = 1; x <= N; x++) { //1~N행
            for (int y = 1; y <= x; y++) { //별의 개수
                System.out.print("*"); //별 찍고
            }
            System.out.println(); //개행
        }
        sc.close();
    }
}
