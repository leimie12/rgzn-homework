import java.util.ArrayList;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int l = read.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        while (l/10>0) {

            arr1.add(l%10);
            l=l/10;
        }
        arr1.add(l);
        for (int i=arr1.size()-1;0<=i;i--) {
            arr2.add(arr1.get(i));
        }
        for (int i=arr2.size()-2;0<=i;i--) {
            arr2.add(arr2.get(i));
        }
        //System.out.print(arr2.size());
        long a=arr2.get(0);

        int c=1;
        for(int i=1;i<arr2.size();i++){

            a = a*10+arr2.get(i);
            //System.out.print(arr2.size());
            //System.out.print(a);
        }
        //double o = Math.sqrt(a);
        if(a%2==0 || a%3==0){
            c=0;
        }else{
            for(long i=5;i*i<=a;i+=6){
                if(a%i==0 || a%(i+2)==0){
                    c=0;
                    break;
                }
            }

        }
        if(a<2){
            c=1;
        }

        if(c==0){
            System.out.println("noprime");
            //System.out.println(a);
        }
        if(c==1){
            System.out.println("prime");
            //System.out.println(a);
        }



    }
}
