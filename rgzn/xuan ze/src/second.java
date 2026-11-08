import java.util.Scanner;

public class second {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b;
        if (a % 2 == 0) {
            b = a / 2;

        }else{
            b = 3*a+1;
        }
        System.out.println(b);

    }
}
