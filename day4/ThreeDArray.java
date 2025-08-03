import java.util.*;
public class ThreeDArray {
    static int sumOf3D(int nums[][][]){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                for(int k=0;k<nums[i][j].length;k++){
                    if(nums[i][j][k]%2==0){
                        sum+=nums[i][j][k];
                    }
                }
            }
        }

        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of x direction : ");
        int x= sc.nextInt();
        System.out.println("Enter the value of y direction : ");
        int y= sc.nextInt();
        System.out.println("Enter the value of z direction : ");
        int z= sc.nextInt();
        int arr[][][]= new int[x][y][z];
        
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                for(int k=0;k<z;k++){
                    System.out.println("Enter the value of arr["+i+"]["+j+"]["+k+"] ");
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.print('[');
        for(int i=0;i<x;i++){
            System.out.print('[');
            for(int j=0;j<y;j++){
                System.out.print(Arrays.toString(arr[i][j]));
            }
            System.out.print(']');
        }
        System.out.println(']');
        System.out.println("Sum: "+sumOf3D(arr));
        sc.close();
    }
}