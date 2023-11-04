import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt(), B = sc.nextInt();
            System.out.printf("Case #%s: %s \n", i, A+B);
        }
        sc.close();
    }
}

// printf 사용. 개행되지 않으므로 \n을 추가로 넣어주었다.  
