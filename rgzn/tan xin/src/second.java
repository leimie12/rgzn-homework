import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        while(read.hasNext()){
            int[] a=new int[10];
            String s=read.nextLine();
            boolean[] use=new boolean[10];
            int v = 0;
            if(s.length()>9){
                System.out.println("NO");
            }else {
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    int g = ch - '0';
                    a[i] = g;
                }
                for (int i = 0; i < s.length(); i++) {
                    if(use[a[i]]){
                        v=1;
                        break;
                    }
                    use[a[i]]=true;
                    if(i>0) {
                        int m = a[i];
                        int n = a[i - 1];
                        int m1 = (m - 1) / 3;
                        int m2 = (m - 1) % 3;
                        int n1 = (n - 1) / 3;
                        int n2 = (n - 1) % 3;
                        if ((m1+n1)%2==0 && (m2+n2)%2==0){
                            int z1=(m1+n1)/2;
                            int z2=(m2+n2)/2;
                            int z = z1*3+z2+1;
                            if(!use[z]){
                                v=1;
                                break;
                            }
                        }
                    }
                }

            }
            if(v==0){
                System.out.println("YES");
            }
            if(v==1){
                System.out.println("NO");
            }
        }

    }
}
