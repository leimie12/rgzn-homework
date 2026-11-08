import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char a = read.next().charAt(0);
        int aa = (int)a;
        for(int i=65;i<=aa;i++){
            for(int j=1;j<=aa-i;j++){
                System.out.print(" ");
            }
            for(int j=65;j<=i;j++){
                System.out.print((char)j);
                if(j==i){
                    for(int k=i-1;65<=k;k--){
                        System.out.print((char)k);
                    }
                }
            }
            System.out.println();



        }

    }
}
