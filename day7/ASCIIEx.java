public class ASCIIEx {
    public static void main(String[] args) {
        String str="";
        for(char c='a';c<='z';c++){
            str+=c;
        }
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            // System.out.println(str.charAt(i)-'0');
            System.out.println((int)str.charAt(i));
        }
        System.out.println((int)'0');
    }
}
