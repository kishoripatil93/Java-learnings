import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int num1, num2, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        num2 = sc.nextInt();
        res = num1 + num2;
        System.out.println("The result is ");  
        System.out.println((res));    
    }
}
