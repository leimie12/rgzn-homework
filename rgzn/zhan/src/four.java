import java.util.Arrays;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=read.next();



        }
        Arrays.sort(a,(c,b) -> (b+c).compareTo(c+b));
        StringBuilder b=new StringBuilder();
        for(String str:a){
            b.append(str);
        }
        System.out.println(b);

    }
}
