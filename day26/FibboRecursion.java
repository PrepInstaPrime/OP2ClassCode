public class FibboRecursion {
    static int fibbo(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibbo(5));
    }
}