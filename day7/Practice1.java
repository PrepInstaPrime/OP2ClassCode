// Write the java program which filters all the vowels
// ex: abbcefbrty 
//output: ae

import java.util.Scanner;
public class Practice1 {
    static void printVowels(String str){
        // str= str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            // if(c=='a'||c=='e'|| c=='i'||c=='o'||c=='u'||c=='A'|| c=='E'||c=='I'||c=='O'||c=='U'){
            //     System.out.print(c);
            // }
            String vowels="AEIOUaeiou";
            if(vowels.indexOf(c)!=-1){
                 System.out.print(c);
                 count++;
            }
        }
        System.out.println();
        System.out.println("Totol vowels: "+count);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str= sc.nextLine();
        printVowels(str);
    }
}
