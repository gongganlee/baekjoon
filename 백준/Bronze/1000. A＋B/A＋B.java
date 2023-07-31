//Scanner클래스를 import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.in : byte 단위로 읽는 것
        Scanner sc = new Scanner(System.in);
        int a, b;

        // a 와 b 를 입력한다. a 와 b 는 정수형이므로 nextInt 사용
        a = sc.nextInt();
        b = sc.nextInt();

        // 입력된 a 와 b 를 더하여 출력한다.
        System.out.println(a + b);
    }
}
