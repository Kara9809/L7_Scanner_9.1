import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert 1st number");
        int a = scanner.nextInt();
        System.out.println("Please insert 2nd number");
        int b = scanner.nextInt();
        System.out.println("Please insert 3rd number");
        int c = scanner.nextInt();
        System.out.println("The sum is : " + (a + b + c));

        scanner.close();
    }
}
