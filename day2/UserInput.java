import java.util.Scanner;
class UserInput {
    public static void main (String args[]){
        // scanner class allow us to take user input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a= sc.nextInt();
        System.out.println("Enter the value of b: ");
        float b= sc.nextFloat();
        System.out.println("Enter the value of c: ");
        boolean c= sc.nextBoolean();
        System.out.println("Enter the value of word: ");
        String word= sc.next();  // single word
        sc.nextLine();  // writing this to avoid next line consumbed by .next()
        System.out.println("Enter the value of para: ");
        String para= sc.nextLine(); // for multiple words
        System.out.println("Enter the value of d: "); 
        char d= sc.next().charAt(0);
        System.out.println("Enter the value of e: ");
        long e= sc.nextLong();
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);
        System.out.println("value of c: "+c);
        System.out.println("value of d: "+d);
        System.out.println("value of e: "+e);
        System.out.println("value of word: "+word);
        System.out.println("value of para: "+para);
    }
}