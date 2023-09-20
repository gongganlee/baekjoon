import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] num = new int[N]; // 입력받은 수(N)만큼 index 생성

        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt(); // 입력받은 수(N)만큼 숫자를 입력받아 저장
        }

        int v = sc.nextInt();
        sc.close();
        int count = 0;

        for (int i=0; i<num.length; i++) {
            if (num[i] == v) {
                count ++;
            }
        }

        System.out.println(count);
    }
}
