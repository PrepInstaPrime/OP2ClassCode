public class Tabulation {
    public static void main(String[] args) {
        int n=5;
        int memory[]= new int[n+1];
        memory[1]=0;
        memory[2]=1;
        for(int i=3;i<=n;i++){
            memory[i]=memory[i-1]+memory[i-2];
        }
        System.out.println(memory[n]);
    }
}
