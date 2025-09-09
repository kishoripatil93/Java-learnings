import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int num, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check if it is prime");
        num = sc.nextInt();
        if (num == 1) {
            System.out.println("The number is not prime");
        }
        for (i = 2; i <= num/2; i++) {
            if ((num % i) == 0) {
                System.out.println("The number is not prime");
                return;
            }
        }
        
        System.out.println("The number is prime");
    }
}