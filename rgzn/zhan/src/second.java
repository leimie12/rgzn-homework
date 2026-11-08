import java.util.Arrays;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int k=read.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];
        long eve = 0;
        for(int i=0;i<n;i++){
            a[i]=read.nextInt();//zao
        }
        for(int i=0;i<n;i++){
            b[i]=read.nextInt();//hei
            eve+=b[i];
            c[i]=a[i]-b[i];
        }
        Arrays.sort(c);
        long sum=0;
        for(int i=n-1;n-k<=i;i--){
            sum+=c[i];


        }
        sum+=eve;
        System.out.println(sum);






    }
}
