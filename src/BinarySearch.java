import java.util.Scanner;

public class BinarySearch {
    public static void main (String[] args) {
        int n , first, last, mid, i, element;
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter all the elements in array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search");
        element = sc.nextInt();
        first = 0;
        last = n - 1;
        mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < element) {
                first = mid + 1;
            }
            else if (arr[mid] == element) {
                System.out.println("Element found at position: " +(mid + 1));
                break;
            }
            else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element not found!");
        }
    }
}
