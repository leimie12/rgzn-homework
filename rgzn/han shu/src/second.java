import java.util.Scanner;

class  yue{
    int a=0;
    int jue(int m,int c){
        if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            this.a=31;

        }else if(m==2){
            this.a=28;
        }else{
            this.a=30;
        }
        if(c==1){
            this.a=29;
        }
        return  this.a;

    }
    int suan(int y,int m,int x){
        int count=0;
        for(int i=1;i<=a;i++){
            int b=i;
            while(b/10>0){
                if(b%10==x){
                    count++;

                }
                b=b/10;
            }
            if(b==x){
                count++;
                //System.out.println("1");
            }
            //System.out.println(b);
        }
        while (m/10>0){
            if(m%10==x){
                count+=a;
            }
            m=m/10;
        }
        if(m==x){
            count+=a;

        }
        while (y/10>0){
            if(y%10==x){
                count+=a;
            }
            y=y/10;
        }
        if(y==x){
            count+=a;
        }
        return  count;
    }

}
public class second {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);



        while(read.hasNextInt()){
            int y = read.nextInt();
            int m = read.nextInt();
            int x = read.nextInt();
            int c = 0;
            int count = 0;
            int a = 0;
            if(y%4==0 && (y%100!=0 || y%400==0) && m==2){
                c+=1;
            }
            yue t = new yue();
            a = t.jue(m,c);
            count = t.suan(y,m,x);
            //System.out.println(count);
            if(x==0){
                if(m<10){
                    count+=a+9;

                    System.out.println(count);
                    //System.out.println(a);
                }else {
                    count+=9;
                    System.out.println(count);
                }
            }else {
                System.out.println(count);

            }

        }
    }
}
