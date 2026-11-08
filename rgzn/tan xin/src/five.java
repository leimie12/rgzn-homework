import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int[] d=new int[10];
        boolean o = false;
        boolean oo =  false;
        int u=0;int uu=0;
        StringBuffer sb=new StringBuffer();
        for(int a=0;a<10;a++){
            d[a]=read.nextInt();
            if(d[a]%2==1){
                u++;
                uu = a;
                if(u==2){
                    o=true;

                }


            }
        }

        int p = 0;
        int q = 0;
        for(int i=0;i<d.length;i++){
            if(d[i]%2==1 && d[i]>2){

                d[i] = d[i]-1;
            }
            if(p!=0 && oo==false){
                for(int j=0;j<d[0];j++){
                    sb.insert(p,"0");
                }
                p+=d[0]/2;
                oo = true;

            }
            if(d[i]%2==0 && i!=0){
                for(int j=0;j<d[i];j++){
                    sb.insert(p,i);
                }
                p+=d[i]/2;

            }


        }
        sb.insert(p,uu);




        if(o){
            System.out.println("-1");
        }else{
            System.out.println(sb);

        }
    }
}
