import java.util.Scanner;

public class InsertionSort {
    public void InsertionSort(int arr[]) {
        int i, j, key;
        for (i = 1; i < arr.length; i++) {
         key = arr[i];
         j = i - 1;
         while (j >= 0 &&  arr[j] > key) {
             arr[j + 1] = arr[j];
             j = j - 1;
         }
         arr[j + 1] = key;
        }
    }

    static void Print(int arr[]) {
        for ( int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        int n;
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = sc.nextInt();
        }
        InsertionSort is = new InsertionSort();
        is.InsertionSort(arr);
        Print(arr);
    }
}