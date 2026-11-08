import java.util.Scanner;

public class first {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        if (a > b) {
            System.out.println(">");
        } else if (a==b) {
            System.out.println("=");

        }else{
            System.out.println("<");

        }

    }
}
