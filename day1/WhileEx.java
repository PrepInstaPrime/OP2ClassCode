class WhileEx {
    public static void main(String args[]){
        // while is used when u do not know how many time your code will execute
        // write a program which tell how many times a number is divisible by 5

        int num=25;
        int count=0;
        while(num%5==0){
            num=num/5;
            count++;
        }
        System.out.println(count);

    }
}