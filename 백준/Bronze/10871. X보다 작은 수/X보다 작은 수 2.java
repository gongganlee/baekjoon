import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), X=sc.nextInt();
        int [] num = new int[N]; // 정수 N개로 이루어진 수열 A 

        for(int i=0; i<N; i++){
            num[i] = sc.nextInt(); //X보다 작은 수를 저장
            if(num[i] < X)
                System.out.print(num[i] + " ");
        }
    }
}
