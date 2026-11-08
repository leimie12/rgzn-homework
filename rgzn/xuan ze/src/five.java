import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long a = read.nextLong();
        long b = read.nextLong();

        if (b%a==0) {
            System.out.println(a+b);
        }  else {
            System.out.println(b-a);

        }
    }
}