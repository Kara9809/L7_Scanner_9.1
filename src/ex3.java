import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert 1st number");
        float a = scanner.nextFloat();
        System.out.println("Please insert 2nd number");
        float b = scanner.nextFloat();
        System.out.println("Please insert 3rd number");
        float c = scanner.nextFloat();
        System.out.println("Avg : " + ((a + b + c) / 3));

        scanner.close();
    }
}
