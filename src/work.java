import java.util.Scanner;

public class work {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x=3,y=17,i=0;
        boolean yn = true;
        System.out.println("1:"+(x+y*x--));

        x=3;
        y=17;
        i=0;
        yn = true;
        System.out.println("2:"+(--x*y+y));
        x=3;
        y=17;
        i=0;
        yn = true;
        System.out.println("3:"+(x<y && yn));
        x=3;
        y=17;
        i=0;
        yn = true;
        System.out.println("4:"+(x>y || !yn));
        x=3;
        y=17;
        i=0;
        yn = true;
        System.out.println("5:"+(y!=++x ? x:y));
        x=3;
        y=17;
        i=0;
        yn = true;
        System.out.println("6:"+(y++/--x));
        x=3;
        y=17;
        i=0;
        yn = true;
        System.out.println("7:"+(i=i++));
    }
}
