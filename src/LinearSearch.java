import java.util.Scanner;

public class LinearSearch {
    public static void main(String [] args) {
        int num , i;
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        num = sc.nextInt();
        arr = new int[num];
        System.out.println("Enter number to search");
        int x = sc.nextInt();
        System.out.println("Enter elements in an array");
        for ( i  = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for ( i = 0; i < num; i++) {
            if (x == arr[i]) {
                System.out.println("num found" + (i + 1));
                break;
            }
        }
        if (x == num) {
            System.out.println("not found");
        }
    }

}
