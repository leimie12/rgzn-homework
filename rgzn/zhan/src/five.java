
import java.util.Scanner;

public class five {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String n=read.next();
        int sum=0;

        for(char a :n.toCharArray()){
            if(a=='a'){
                sum++;
            }else if(a=='b'){
                sum--;
            }
            if(sum<0){

                break;
            }
        }
        if(sum==0){
            System.out.println("Good");
        }else {
            System.out.println("Bad");
        }


    }
}
