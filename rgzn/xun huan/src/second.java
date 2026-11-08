import java.util.Scanner;

public class second {
    static int b = 1;
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%4d",b);
                b++;
            }
            System.out.println();

        }

    }
}
