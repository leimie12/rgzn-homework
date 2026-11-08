import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        read.nextLine();
        for(int p=0;p<n;p++){
            String s=read.nextLine();
            StringBuilder sb=new StringBuilder();
            int i=0;
            while (i<s.length()){
                char c=s.charAt(i);
                if(c == '0' || c == '2' || c == '4' || c == '6' || c == '9'){
                    sb.append(c);
                    i++;
                    continue;
                }
                if (s.startsWith("zero", i)) {
                    sb.append('0');
                    i += 4;
                } else if (s.startsWith("four", i)) {
                    sb.append('4');
                    i += 4;
                } else if (s.startsWith("nine", i)) {
                    sb.append('9');
                    i += 4;
                } else if (s.startsWith("two", i)) {
                    sb.append('2');
                    i += 3;
                } else if (s.startsWith("six", i)) {
                    sb.append('6');
                    i += 3;
                } else {
                    i++;
                }
                ;
            }
            System.out.println(sb);
        }


    }
}
