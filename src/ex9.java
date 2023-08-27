import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are You sure You want to exit?");
        char input = scanner.next().charAt(0);
        if (input == 'Y') {
            System.out.println("Thank You and Good bye");
        } else if (input == 'N') {
            System.out.println("Thanks for staying with us");
        } else {
            System.out.println("Unsupported, Thank You and good bye");
        }
        scanner.close();
    }
}
