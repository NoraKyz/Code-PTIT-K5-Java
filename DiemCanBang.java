import java.util.*;

public class DiemCanBang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[100005];
            int sum = 0;

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            int res = -1, s = 0;
            for (int j = 0; j < n; j++){
                if(s == sum - s - arr[j]) {
                    res = j + 1;
                    break;
                } else {
                    s += arr[j];
                }
            }
            
            System.out.println(res);
        }

        sc.close();
    }
}