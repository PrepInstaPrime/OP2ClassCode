public class StringBuilderandBuffer {
    public static void main(String[] args) {
        StringBuilder str1= new StringBuilder("Hello");
        StringBuilder str2= new StringBuilder("Hey");
        String str3="Hello";
        // use toString to convert string builder or buffer to normal string
        System.out.println(str1.toString().equals(str3));
        str1.reverse();
        System.out.println(str1);
        str1.repeat(str1, 4);
        System.out.println(str1);
        str2.append("Bye");
        System.out.println(str2);
        str2.replace(1,3,"");
        System.out.println(str2);
        System.out.println(str2.charAt(0));
        StringBuffer str4= new StringBuffer("class");
        // note: all the methods of builder and buffer are same
        str4.reverse();
        System.out.println(str4);
        // convert string to string builder
        String str5="say something";
        StringBuilder str6= new StringBuilder(str5);
        System.out.println(str6);
    }
}
