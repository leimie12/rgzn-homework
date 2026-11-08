import java.util.Scanner;

public class four {
    public static void suan(int a) {
        int n=a;
        for (int i = 1; i <= n; i+=2) {


            for (int j = 1; j <=(n-i)/2; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i == n) {
                for (int o = n-2; 1 <= o; o-=2) {
                    for (int p = 1; p <= (n - o)/2; p++) {
                        System.out.print(" ");

                    }
                    for (int p = 1; p <= o; p++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }


        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int n = sc.nextInt();
            suan(n);
        }



        }

    }

