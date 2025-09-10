import java.util.Scanner;

public class Array {
    static int sum_of_all_elts(int[] arr, int n) {
        int i, sum = 0;
        for (i = 0; i < n; i++) {
            sum = arr[i] + sum;
        }
        return sum;
    }
    
    static int largest_elt_of_arr(int[] arr, int n) {
        int i, max = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int i, n, max = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elts");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elts");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // Finding max of all elts
        max = largest_elt_of_arr(arr, n);
        System.out.println("Max elt is: " + max);

        // Finding sum of all elts
        sum = sum_of_all_elts(arr, n);
        System.out.println("sum of elts is: " + sum);
    }
}
