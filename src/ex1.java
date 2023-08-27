import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert Your first name");
        String firstName = scanner.next();
        System.out.println("Please insert Your last name");
        String lastName = scanner.next();
        System.out.println("Please insert You age");
        float age = scanner.nextFloat();
        System.out.println("Please insert Your city");
        String city = scanner.next();

        System.out.println("My name is " + firstName + " " + lastName + ", " + "I'm " + age + " years old and I live in " + city);
        scanner.close();
    }
}