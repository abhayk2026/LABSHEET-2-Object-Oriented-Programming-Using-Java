import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result;

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            result = (ch == 'a' || ch == 'e' || ch == 'i' ||
                      ch == 'o' || ch == 'u' ||
                      ch == 'A' || ch == 'E' || ch == 'I' ||
                      ch == 'O' || ch == 'U')
                      ? "Vowel" : "Consonant";
        } else {
            result = (ch >= '0' && ch <= '9')
                    ? "Digit" : "Special Symbol";
        }

        System.out.println(result);

        sc.close();
    }
}