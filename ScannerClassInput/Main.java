import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Byte: ");
        byte bVal = scan.nextByte();

        System.out.print("Enter a Short: ");
        short sVal = scan.nextShort();

        System.out.print("Enter a line: ");
        String line = scan.nextLine();
        
        System.out.print("Enter an integer: ");
        int intValue = scan.nextInt();

        System.out.print("Enter a double: ");
        double doubleValue = scan.nextDouble();

        System.out.print("Enter a boolean (true or false): ");
        boolean booleanValue = scan.nextBoolean();

        System.out.print("Enter a word: ");
        String word = scan.next();


        System.out.println("Byte: " + bVal);
        System.out.println("Short: " + sVal);
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("Word: " + word);
        System.out.println("Line: " + line);

        scan.close();
    }
}
