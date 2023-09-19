import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N]; //정수 N개로 이루어진 수열 A

        for(int i=0; i<N; i++){ //N번만큼 반복하여 숫자를 받는다.
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); //배열 오름차순 정렬
        System.out.println(arr[0]+" "+arr[N-1]);
    }
}