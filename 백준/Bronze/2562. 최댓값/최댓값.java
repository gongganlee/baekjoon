import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0; // 최댓값 초기화
        int index = 0; // 자릿값 초기화

        for(int i=0; i<9; i++){ // 9번 반복하여
            arr[i] = sc.nextInt(); // 배열 값 입력 받기

            if(max < arr[i]) { // 입력받은 값이 max보다 클 경우
                max = arr[i]; // max에 값 저장
                index = i + 1; // 인덱스는 0부터 시작하므로 +1 
            }
        }
        sc.close();
        System.out.println(max);
        System.out.println(index);
    }
}