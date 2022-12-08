import java.util.*;

class CheckBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String str = sc.nextLine();
            GfG g = new GfG();
            boolean b = g.isBinary(str);
            if (b == true) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            T--;
        }
    }
}

class GfG {
    boolean isBinary(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
}