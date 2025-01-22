/*Create a class Utility with astatic method convertToUpper(String str) that takes a string as 
input and returns it in uppercase. Test this method in the main function.*/

package Day03.StaticVariablesAndMethods;

public class Utility {

    static String convertToUpper(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {

        String smallCaseString = "Vignesh";

        String upperCaseString = convertToUpper(smallCaseString);

        System.out.println("Converted String: " + upperCaseString);
    }

}
