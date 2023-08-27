import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 1st number");
        int a = scanner.nextInt();
        System.out.println("Insert 2nd number");
        int b = scanner.nextInt();
        System.out.println("Insert 3rd number");
        int c = scanner.nextInt();
        System.out.println("Min : " + Math.min(a, Math.min(b, c)));

        scanner.close();
    }
}
