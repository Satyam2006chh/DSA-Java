// Check if One String is Rotation of Another

public class StringRotation {

    public static void main(String[] args) {

        String s1 = "ABCD";
        String s2 = "CDAB";

        if(s1.length() != s2.length()){

            System.out.println("Not Rotation");
            return;
        }

        String temp = s1 + s1;

        if(temp.contains(s2))
            System.out.println("Rotation");
        else
            System.out.println("Not Rotation");
    }
}
