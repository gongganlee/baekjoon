import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
                int A = sc.nextInt(), B = sc.nextInt();
                System.out.println(A + B);
        }
        sc.close();
    }
}

// * hasNext() : 입력값 있을 때 true, 없을 때 false 
// * hasNextInt() : 정수를 입력받을 때 true, 정수가 아닐 때 false 
