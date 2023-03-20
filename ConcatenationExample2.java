public class ConcatenationExample2 {
    public static void main(String[] args) {
        // Declare two string variables
        String firstName = "John";
        String lastName = "Doe";

        // Concatenate the two strings using the concat() method
        String fullName = firstName.concat(" ").concat(lastName);

        // Print the result
        System.out.println(fullName);
    }
}