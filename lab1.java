import java.util.Scanner;
public class lab1{
    public static void main(String[] args) {
        int n1, n2, sum, diff, mul;
        float div;
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter 2 numbers:");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        sum = n1 + n2;
        diff = n1 - n2;
        mul = n1 * n2;
        div =(float) n1 / n2;
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
        scanner.close();
    }
}
