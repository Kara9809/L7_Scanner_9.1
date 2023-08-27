import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert Your age");
        float age = scanner.nextFloat();
        if (age >= 18) {
            System.out.println("Over");
        } else {
            System.out.println("Under");
        }
        scanner.close();
    }
}
