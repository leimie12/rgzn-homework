import java.util.*;
import java.math.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        String s = sc.next();

        BigDecimal x = new BigDecimal(s);
        for (long k = 0; k < t; k++) {
            String w = x.toPlainString();
            int d = w.indexOf('.');
            if (d < 0) break;
            int i = d + 1;
            while (i < w.length() && w.charAt(i) < '5') i++;
            if (i == w.length()) break;
            x = x.setScale(i - d - 1, RoundingMode.HALF_UP);
        }
        System.out.println(x.stripTrailingZeros().toPlainString());
    }
}