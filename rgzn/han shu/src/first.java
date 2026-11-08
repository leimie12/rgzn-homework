import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int l = read.nextInt();
        int r = read.nextInt();
        int count = 0;
        for(int i = l; i <= r; i++){
            int a=i;
            while (a/10>0){
                if(a%10==2){
                    count++;
                }
                a=a/10;


            }
            if(a==2){
                count++;
            }
        }
        System.out.println(count);
    }
}
