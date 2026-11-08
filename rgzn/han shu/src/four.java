import java.util.Scanner;
//0 5 2/1区间 18 20
public class four {
    public static int suan(int n){
        int count=0;
        int sum=0;
        while(10<=n){
            sum+=n%10;
            n/=10;
        }
        sum+=n;
        if(sum%5==0){
            count++;
            //System.out.println("sum="+sum);
        }
        return count;


    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        if(y<10){
           if(5<x){
               System.out.println("2");
           } else{
               System.out.println("1");
           }
        }else{
            int a = (x/10)*2;
            int b = (y/10)*2;
            int count = b-a;//10-20
            for(int i=y-(y%10);i<=y;i++){
                count+=suan(i);

            }
            for(int i=x-(x%10);i<=x;i++){
                count-=suan(i);

            }
            System.out.println(count);

        }


    }
}
