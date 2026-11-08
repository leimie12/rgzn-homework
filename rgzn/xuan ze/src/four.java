import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        if(a%b==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}