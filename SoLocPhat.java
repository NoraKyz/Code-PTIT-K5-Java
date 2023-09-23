import java.util.*;

public class SoLocPhat {

    public static ArrayList<String> res = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            res.clear();

            int n = sc.nextInt();

            ArrayList<String> a = new ArrayList<>();
            a.add("6");
            a.add("8");

            solve(n, a);

            System.out.println(res.size());

            for(int i = res.size() - 1; i >= 0; i--) {
                System.out.print(res.get(i) + " ");
            };
            System.out.println();
        }

        sc.close();
    }

    public static void solve(int n, ArrayList<String> a) {
        ArrayList<String> list = new ArrayList<>();

        for (String it : a) {
            if (it.length() <= n) {
                res.add(it);
                list.add(it + "6");
                list.add(it + "8");
            }
        }

        if (list.size() == 0) {
            return;
        }

        solve(n, list);
    }
}