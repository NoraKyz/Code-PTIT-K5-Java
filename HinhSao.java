import java.util.*;

public class HinhSao {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());

    int a = sc.nextInt();
    int b = sc.nextInt();

    int cntA = 1, cntB = 1;

    for (int i = 2; i < t; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
    
        if (x == a || y == a) {
            cntA++;
        } else if (x == b || y == b) {
            cntB++;
        }
    }

    if(cntA == t - 1 || cntB == t - 1) {
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
    
    sc.close();
  }
}