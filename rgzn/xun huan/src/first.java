import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            suan(n);
        }
    }

    public static void suan(int a) {
        int n=a;
        for (int i = 1; i <= n; i++) {


            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= 1 + 2 * (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i == n) {
                for (int o = n - 1; 1 <= o; o--) {
                    for (int p = 1; p <= n - o; p++) {
                        System.out.print(" ");

                    }
                    for (int p = 1; p <= 1 + 2 * (o - 1); p++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }


        }
    }
    }
