package Day13.JunitPrograms;

public class PalindromeChecker {

    public boolean palindromeCheck(String string) {
        if (string == null)
            throw new IllegalArgumentException("invalid string");
        var str = new StringBuilder(string).reverse().toString();
        return string.equals(str);
    }

}
