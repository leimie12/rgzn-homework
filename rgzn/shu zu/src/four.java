import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int L = sc.nextInt();
        int M = sc.nextInt();
        boolean[] lu = new boolean[L + 1];


        for (int i = 0; i < M; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            for (int j = l; j <= r; j++) {
                lu[j] = true;
            }
        }

        // 统计未被标记（仍有树）的位置
        int count = 0;
        for (int i = 0; i <= L; i++) {
            if (!lu[i]) {
                count++;
            }
        }

        System.out.println(count);


}

}
