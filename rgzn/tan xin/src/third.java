import java.util.*;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\A");                 // 一次性读入全部内容（含换行）
        String s = sc.hasNext() ? sc.next() : "";

        StringBuilder b = new StringBuilder();
        boolean o = false;                      // 是否在引号里
        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            if (o) {                                      // 引号内原样输出
                b.append(c);
                if (c == '"' && s.charAt(i - 1) != '\\') o = false;
                i++;
            } else if (c == '"') {                        // 引号开始
                if (i == 0 || s.charAt(i - 1) != '\\') o = true;
                b.append(c);
                i++;
            } else if (c == '/' && i + 1 < s.length() && s.charAt(i + 1) == '*') {
                int j = s.indexOf("*/", i + 2);            // 找注释结尾
                if (j < 0) { b.append(c); i++; }           // 只有一半，保留
                else i = j + 2;                            // 整段删掉
            } else {
                b.append(c);
                i++;
            }
        }
        System.out.print(b);
    }
}