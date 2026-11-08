import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int x = read.nextInt();
        int ji =0;
        for(int i=1;i<=n;i++){
            int a=i;
            while(a>=10){

                if(a%10==x){
                    ji++;
                }

                a=a/10;
            }
            if(a==x){
                ji++;
            }
        }
        System.out.println(ji);

    }
}
