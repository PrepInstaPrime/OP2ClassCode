import java.util.Arrays;
public class Memoization {
    static int memory[];
    static int fibbo(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(memory[n]!=-1){
            return memory[n];
        }
        return memory[n]=fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        memory= new int[n+1];
        Arrays.fill(memory, -1);
        System.out.println(fibbo(n));
    }
}
