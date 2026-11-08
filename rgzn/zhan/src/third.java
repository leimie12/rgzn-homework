import java.util.Arrays;
import java.util.Scanner;

public class third {
    public static int suan(long[] a,int n){
        int o=0;
        for(int i=0;i<n-2;i++) {
            for(int j=i+1;j<n-1;j++) {
                for(int k=j+1;k<n;k++) {
                    if(a[i]+a[j]>a[k]) {
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                        o=1;
                        return o;                    }

                }
            }
        }
        return o;
    }
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        long[] a=new long[n];
        int o=0;
        for(int i=0;i<n;i++) {
            a[i] = read.nextInt();
        }
        Arrays.sort(a);
        o=suan(a,n);
        if(o==0) {
            System.out.println("No solution");
        }
    }
}

