import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt(), B = sc.nextInt();
            System.out.println("Case #" + i + ": " + (A+B));
        }
        sc.close();
    }
}

// println으로 자동개행되게하고 Case #x: 를 나눴다. 
// * A+B값에 () 괄호 씌워주기!
