import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int k = read.nextInt();
        int m = read.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n-1; i++) {
            list.add(i);
        }
        int len = list.size();
        int i=k;
        //for (int i = k+(m-1); i <= n-1; i+=m-1)
        while (len!=1) {

            i = (i+m-1)%len;
            list.remove(i);
            len = list.size();
        }
        System.out.println(list.get(0));
    }

}
