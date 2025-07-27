class IfelseEx {
    public static void main(String args[]){
        int a=5;
        int b=6;
        if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("B is greater");
        }

        // if else if ladder 
        // grading system
        /*
         * Marks>=90 : A
         * Marks>=70: B
         * Marks>= 45: C
         * otherwise fail
         */

        int marks = 86;
        if(marks>=90){
            System.out.println("Your Grade is A");
        }else  if(marks>=70){
            System.out.println("Your Grade is B");
        } else  if(marks>=45){
            System.out.println("Your Grade is C");
        }else {
            System.out.println("Fail");
        }
    }
}