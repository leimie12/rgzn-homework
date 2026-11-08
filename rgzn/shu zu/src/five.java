import java.util.Scanner;

public class five {
    public static void bi(int n,int[] nn){
        if(nn[n-1]>nn[n-2]){
            if(nn[n-1]==15){
                System.out.println("DOWN");
            }else {
                System.out.println("UP");
            }
        }else{
            if(nn[n-1]==0){
                System.out.println("UP");
            }else  {
                System.out.println("DOWN");
            }
        }
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int o=0;int p=0;
        int[] nn =  new int[n];
        for (int i = 0; i < n; i++) {
            nn[i] = read.nextInt();
            if(i==0){
                continue;
            }else{
                int b = nn[i]-nn[i-1];
                if(Math.abs(b)!=1 || nn[i]>15 || nn[i]<0){

                    o=1;
                    break;
                }
            }
        }

        if(n==1){

            if(nn[n-1]==0){
                System.out.println("UP");
            }
            else if(nn[n-1]==15){
                System.out.println("DOWN");
            }else{
                System.out.println("-1");
            }
        }
        else if(o==1){
            System.out.println("-1");
        }else{
            bi(n,nn);
        }


    }

}