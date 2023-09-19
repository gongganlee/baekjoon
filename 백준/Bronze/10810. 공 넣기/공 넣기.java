import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 바구니 개수
        int[] arr = new int[N]; // 바구니를 배열로 표현
        int M = scan.nextInt(); // 공을 넣는 횟수

        for(int i= 0; i<M; i++){
            int I = scan.nextInt(); // 시작 바구니 번호
            int J = scan.nextInt(); // 끝 바구니 번호
            int K = scan.nextInt(); // 공의 번호

            for(int j = I-1; j<J; j++){ // 바구니 번호를 배열 인덱스로 변환
                arr[j] = K;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}