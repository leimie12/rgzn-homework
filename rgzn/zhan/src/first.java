public class first {
    static int n = 8;
    static int[] path = new int[n];
    static boolean[] used = new boolean[n];
    static StringBuilder sb = new StringBuilder();

    static void dfs(int d) {
        if (d == n) {
            for (int i = 0; i < n; i++) {
                if (i > 0) sb.append(' ');
                sb.append(path[i]);
            }
            sb.append('\n');
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (used[i - 1]) continue;
            used[i - 1] = true;
            path[d] = i;
            dfs(d + 1);
            used[i - 1] = false;
        }
    }

    public static void main(String[] args) {
        dfs(0);
        System.out.print(sb);
    }
}