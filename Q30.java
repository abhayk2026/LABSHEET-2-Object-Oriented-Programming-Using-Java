import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check whether number is a power of 4
        int temp = n;
        boolean powerOf4 = false;

        while (temp > 1 && temp % 4 == 0) {
            temp = temp >> 2;
        }

        if (temp == 1) {
            powerOf4 = true;
        }

        if (powerOf4) {
            System.out.println(n + " is a power of 4");
        } else {
            System.out.println(n + " is not a power of 4");
        }

        // Toggle the 3rd bit
        int toggled = n ^ (1 << 2);

        System.out.println("After toggling 3rd bit = " + toggled);

        // Multiplication table
        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 20; i++) {

            int result = n * i;

            // Skip multiples of 6
            if (result % 6 == 0) {
                continue;
            }

            // Stop at multiples of 48
            if (result % 48 == 0) {
                break;
            }

            System.out.println(n + " x " + i + " = " + result);
        }

        sc.close();
    }
}