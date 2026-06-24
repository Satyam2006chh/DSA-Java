// Check if Two Strings are Equal Ignoring Case

public class StringsEqualIgnoreCase {

    public static void main(String[] args) {

        String s1 = "HELLO";
        String s2 = "hello";

        if(s1.equalsIgnoreCase(s2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
