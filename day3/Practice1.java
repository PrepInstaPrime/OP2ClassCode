import java.util.*;
public class Practice1 {
    public static void main (String args[]){
        // need to take size of the array 
        Scanner sc= new Scanner ( System.in);
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the value of "+ (i+1)+ " place: ");
            nums[i]= sc.nextInt();
            System.out.println();
        }
        System.out.println(Arrays.toString(nums));

    } 
}