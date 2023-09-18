import java.util.*;

public class SapXepDoiChoTrucTiep {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
        arr[i] = sc.nextInt();
    }

    solve(arr, N);

    sc.close();
}

public static void solve(int[] arr, int N) {
    for (int i = 0; i < N - 1; i++) {
        boolean swapped = false;

        for (int j = i + 1; j < N; j++) {
            if (arr[i] > arr[j]) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                swapped = true;
            }
        }

        if (!swapped) {
            break;
        }
        System.out.print("Buoc " + (i + 1) + ": ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
}