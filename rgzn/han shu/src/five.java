
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        for (int i = 0; i < t; i++) {
            String a = read.next();
            String b = read.next();
            int c = Math.abs(a.length() - b.length());
            int d = Math.min(a.length(), b.length());
            if(c==0){
                System.out.print("5");
                for(int j=0;j<a.length()-2;j++){
                    System.out.print("4");
                }
                System.out.print("2");
                for(int j=0;j<a.length()-2;j++){
                    System.out.print("8");
                }
                System.out.println("9");
            }else if(c==1){
                System.out.print("5");
                for(int j=0;j<d-2;j++){
                    System.out.print("4");
                }
                System.out.print("35");
                for(int j=0;j<d-2;j++){
                    System.out.print("8");
                }
                System.out.println("9");

            }else {
                System.out.print("5");
                for(int j=0;j<d-2;j++){
                    System.out.print("4");
                }
                System.out.print("3");
                for(int j=0;j<c-1;j++){
                    System.out.print("6");
                }
                System.out.print("5");
                for(int j=0;j<d-2;j++){
                    System.out.print("8");
                }
                System.out.println("9");

            }

        }
    }

}
