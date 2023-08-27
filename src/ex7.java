import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert 1st number");
        int a = scanner.nextInt();
        System.out.println("Please insert 2nd number");
        int b = scanner.nextInt();
        System.out.println("Please insert 3rd number");
        int c = scanner.nextInt();
        System.out.println("Max : " + Math.max(a, Math.max(b,c)));

        scanner.close();
    }
}
