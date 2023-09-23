import java.util.*;

public class So0VaSo9 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    while(t-- > 0) {
        int n = sc.nextInt();
        ArrayList<Long> a = new ArrayList<>();
        a.add(9L);
        System.out.println(solve(n, a));
    }

    sc.close();
  }

  public static Long solve(int n, ArrayList<Long> a) {  
    ArrayList<Long> list = new ArrayList<>(); 

    for(Long it : a){
        if(it % n == 0) {
            return it;
        }

        list.add(it * 10);
        list.add(it * 10 + 9);
    }

    return solve(n, list);
  }
}