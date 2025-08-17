// write a program to check two given strings are anagram or not

import java.util.Scanner;

public class Anagram {
    static boolean chechAnagram(String str1, String str2){
        // constant auxilary space which is not equals to n
        int freq1[]= new int[26];
        int freq2[]= new int[26];
        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
            freq1[c-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            char c=str2.charAt(i);
            freq2[c-'a']++;
        }
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
        // tc: O(n), sc: O(1)
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(chechAnagram(str1,str2));
    }
}
