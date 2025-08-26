public class FibboEx {
    static int fibbo(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String[] args) {
        int fiboN= fibbo(5);
        System.out.println(fiboN);
    }
}
