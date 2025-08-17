// find the maximum repeated character in string str
// constraint: string does not contain any non alphate character
// in str c belongs to 'a-z'

import java.util.Arrays;

public class ASCIIPractice1 {
    public static void main(String[] args) {
        String str= "abcabcdaaabbbbcc";
        int ferq[]= new int[26];
        for(int i=0;i<str.length();i++){
            ferq[str.charAt(i)-'a']++;
            // freq['a'-'a']++=> freq[97-97]++=> freq[0]++ => [1,0,0...0]
            // freq['b'-'a']++ => freq[98-97]++ => freq[1]++ => [1,1,0,0,...,0]
        }
        System.out.println(Arrays.toString(ferq));
        int maxIdx=0;
        int maxValue=0;
        for(int i=0;i<ferq.length;i++){
            if(maxValue<ferq[i]){
                maxValue=ferq[i];
                maxIdx=i;
            }
        }
        System.out.println((char)(maxIdx+97));


    }
}
