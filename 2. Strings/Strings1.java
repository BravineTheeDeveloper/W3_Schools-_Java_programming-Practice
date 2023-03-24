//This program helps you identify the length of a string

public class Strings1 {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //The .lenght() extension on the string name is used to print the length of the string
        System.out.println("The length of the txt string is: " + txt.length());
      }
}

//Other string methods available are {toUpperCase()} and {toLowerCase()}
//The toUpperCase() is used to print the string contents to uppercase letters as the name suggest
//The toLowerCase() is used to print the content of the string to lowercase letters

//The program below is used to print index (the position) of the first occurrence of a specified text in a string (including whitespace)
/**
 *String txt = "Please locate where 'locate' occurs!";
 *System.out.println(txt.indexOf("locate")); // Outputs 7
 */