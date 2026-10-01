import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter power of 2: ");
        int power = sc.nextInt();

        int multiplied = n << power;
        int divided = n >> power;

        System.out.println("After multiplication = " + multiplied);
        System.out.println("After division = " + divided);

        sc.close();
    }
}