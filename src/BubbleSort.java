import java.util.Scanner;

public class BubbleSort {
    public void bubbleSort (int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[];
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        bs.print(arr);
    }
    }

