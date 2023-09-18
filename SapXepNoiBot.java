import java.util.*;

public class SapXepNoiBot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
        arr[i] = sc.nextInt();
    }

    bubbleSort(arr, N);

    sc.close();
}

public static void bubbleSort(int[] arr, int N) {
    for (int i = 0; i < N - 1; i++) {
        boolean swapped = false;

        for (int j = 0; j < N - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

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