import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //정수의 개수 N (1<=N<=100)
        int [] num = new int[N]; // 입력받은 수(N)만큼 index 생성

        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt(); // 입력받은 수(N)만큼 arr에 숫자를 입력받아 저장
        }

        int v = sc.nextInt(); // 찾을 숫자
        sc.close();
        int count = 0; // 찾을 숫자의 개수

        for (int j : num) {
            if (j == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}