Import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = Scanner.nextLine().trim();

        String[] nameParts = fullName.split("\\s+");

        if (nameParts.length == 2) {

            String firstName = nameParts[0];
            String lastName = nameParts[1];
            System.out.println("First name: " + firstName);
            System.out.println("Middle name: (None)");
        } else if (nameParts.length == 3) {

            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastname = nameParts[2];
            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastname);
        } else {
            System.out.println("invalid name format. Please provide your name in 'first last' or 'first middle last' format.");
    }

    }

}
