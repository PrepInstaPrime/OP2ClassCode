import java.util.*;
public class TimeComplexity {
    static void intro(){
        System.out.println("hey i am java");
        System.out.println(" i am good in development");
    }
    static void natural(){

        // here we are not using input size so loop will run fixed number of times
        for(int i=1;i<=20;i++){
            System.out.println(i);
        }
    }
    static void even(int n){
        // here this loop will run n time and this depends on input size that's why TC will O(n)
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
            
        }
    }
    static void table(int n){
        // external loop is dependent on the input size while internal loop is having fix number of iterations which means TC: O(n*10)=O(n)
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        // fixed number of line of code to execute : TC: O(1)-constant
       /*  intro();
        natural();  
        */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of n ");
        int n= sc.nextInt();
        // even(n);  // TC: O(n)
        table(n);
        
    }
}