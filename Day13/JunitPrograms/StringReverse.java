package Day13.JunitPrograms;

public class StringReverse {
    public String reverseString(String string) {
        if (string == null)
            throw new IllegalArgumentException("invalid string");
        StringBuilder str = new StringBuilder(string);
        return str.reverse().toString();
    }
}
