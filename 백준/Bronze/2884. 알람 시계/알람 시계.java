import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt();
        if (m < 45)
            if(h == 0)
                System.out.printf("%s %s", h+23, m+15); //h-1+24
            else
                System.out.printf("%s %s", h-1, m+15); //m-45+60
        else
            System.out.printf("%s %s", h, m-45);
        sc.close();
    }
}

/* 
코드 해석
시를 받는 변수h, 분을 받는 변수m
중첩if문 사용. if문 (m이 45보다 작은 수) -> if문(h가 0일때)
m이 45보다 작고, h가 0일 때 : 45분 일찍 알람 설정하면 h,m 음수가 되므로 h+23, m+15 ( h-1+24, m-45+60 )
m이 45보다 작고, h가 0이 아닐 때 : h-1, m+15
m이 45보다 클 때 : h, m-45 
*/
