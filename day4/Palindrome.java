import java.util.Scanner;
public class Palindrome {
    static boolean checkPalindrome(String str){
        str= str.toLowerCase().replaceAll(" ","");
        int left=0;
        int right= str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String");
        String str= sc.nextLine();
        System.out.println("Palindrome : "+ checkPalindrome(str));
       
    }
}