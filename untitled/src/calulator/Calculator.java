package calulator;
import java.util.*;
import java.math.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("1. Addition"+"  2. Subtraction"+"  3. Multiplication"+"  4. Division");
        int op;
        float n1, n2, ans;
        Scanner sc;

        sc = new Scanner(System.in);
        System.out.println("Choose any of above");
        op = sc.nextInt();

        switch (op)
        {
            case 1:
                System.out.println("Enter value of 1st number:");
                n1 = sc.nextFloat();
                System.out.println("Enter value of 2nd number:");
                n2 = sc.nextFloat();
                ans = n1 + n2;
                System.out.println("Your answer is:"+ans);
                break;

            case 2:
                System.out.println("Enter value of 1st number:");
                n1 = sc.nextFloat();
                System.out.println("Enter value of 2nd number:");
                n2 = sc.nextFloat();
                ans = n1 - n2;
                System.out.println("Your answer is:"+ans);
                break;

            case 3:
                System.out.println("Enter value of 1st number:");
                n1 = sc.nextFloat();
                System.out.println("Enter value of 2nd number:");
                n2 = sc.nextFloat();
                ans = n1 * n2;
                System.out.println("Your answer is:"+ans);
                break;

            case 4:
                System.out.println("Enter value of 1st number:");
                n1 = sc.nextFloat();
                System.out.println("Enter value of 2nd number:");
                n2 = sc.nextFloat();
                ans = n1 / n2;
                System.out.println("Your answer is:"+ans);
                break;

            default:
                System.out.println("Wrong choice");
                break;
        }


    }
}