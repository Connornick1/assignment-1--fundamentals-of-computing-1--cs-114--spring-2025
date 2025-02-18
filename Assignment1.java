// Import libraries here
import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        // Add your code here
        Scanner scanner = new Scanner(System.in);

        // NUMBER 1 *******************************************************************
        System.out.print(
                "        CCCCCCCCCCCCCNNNNNNNN        NNNNNNNN\n" +
                "     CCC::::::::::::CN:::::::N       N::::::N\n" +
                "   CC:::::::::::::::CN::::::::N      N::::::N\n" +
                "  C:::::CCCCCCCC::::CN:::::::::N     N::::::N\n" +
                " C:::::C       CCCCCCN::::::::::N    N::::::N\n" +
                "C:::::C              N:::::::::::N   N::::::N\n" +
                "C:::::C              N:::::::N::::N  N::::::N\n" +
                "C:::::C              N::::::N N::::N N::::::N\n" +
                "C:::::C              N::::::N  N::::N:::::::N\n" +
                "C:::::C              N::::::N   N:::::::::::N\n" +
                "C:::::C              N::::::N    N::::::::::N\n" +
                " C:::::C       CCCCCCN::::::N     N:::::::::N\n" +
                "  C:::::CCCCCCCC::::CN::::::N      N::::::::N\n" +
                "   CC:::::::::::::::CN::::::N       N:::::::N\n" +
                "     CCC::::::::::::CN::::::N        N::::::N\n" +
                "        CCCCCCCCCCCCCNNNNNNNN         NNNNNNN"
        );
        System.out.println("");
        System.out.println("");

        // NUMBER 2 *******************************************************************

        // Get the temperature in Fahrenheit
        System.out.print("Enter a temperature in Fahrenheit: \n");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display temperature in Celsius
        System.out.println("");
        System.out.println("Temperature in Celsius: \n" + celsius);

        // NUMBER 3 *******************************************************************

        scanner.nextLine(); // Consume leftover newline from previous input
        System.out.println("");
        System.out.print("Enter a 5-character string: \n");
        String mutableString = scanner.nextLine();

        // Extract substring with middle 3 characters
        String trimmedString = mutableString.substring(1, 4);

        // Reverse the string
        StringBuilder reversedString = new StringBuilder(trimmedString);
        reversedString.reverse();

        // Print the reversed string
        System.out.println("");
        System.out.println("Reversed string with the middle 3 characters: \n" + reversedString);
        scanner.close();

        // NUMBER 4 *******************************************************************
        Random generator = new Random();
        int num1;
        num1 = generator.nextInt(16352) + 32;
        System.out.println("");
        System.out.println("Random number from 32 to 16,384: \n" + num1);

        scanner.close();
    }
}
