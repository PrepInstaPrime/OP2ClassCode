import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        String str1= "Hello";
        String str2="Hello";
        String str3= new String("Hello");
        // comparing references 
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        // compare values
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        // find length of string : .length() method 
        // convert in lowercaes 
        String str4=str1.toLowerCase();
        System.out.println(str4);
        String str5= str1.toUpperCase();
        System.out.println(str5);

        // substring : start index and end index while end index is excluded
        String str6= str1.substring(1,3);
        System.out.println(str6);

        System.out.println(str1.charAt(1));

        // iterate over string 
        for(int i=0;i<str1.length();i++){
            System.out.println(str1.charAt(i));
        }
        // convert string into array
        // toCharArray()
        char arr[]= str1.toCharArray();
        System.out.println(arr[3]);
        // concatenation means joining two strings 
        // .concat method 
        System.out.println(str1.concat(str4));
        // convert string into string array 
        String str7= "Hey this is Karan and i am friend of charan";
        String strArr[]= str7.split("");
        String strArr1[]= str7.split(" ");
        String strArr2[]= str7.split("i");
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(strArr1));
        System.out.println(Arrays.toString(strArr2));
        String str8="";
        for(int i=0;i<strArr2.length;i++){
            str8=str8+strArr2[i];
        }
        System.out.println(str8);



    }
}
