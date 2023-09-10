import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt(), t = sc.nextInt();
        if ((m+t) < 60)
            System.out.printf("%s %s", h, m+t);
        else //m+t >= 60
            System.out.printf("%s %s", (h+((m+t)/60))%24,(m+t)%60);
        sc.close();
    }
}