// 25. Convert String to Uppercase Without Built-in Function

public class ConvertToUppercase {

    public static void main(String[] args) {

        String str = "hello java";
        String result = "";

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        System.out.println(result);
    }
}
