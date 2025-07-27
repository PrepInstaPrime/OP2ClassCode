class First{
    void Intro(){
        System.out.println("Hey i am first class");
    }
    String Money="1Cr";
}
class Second extends First{
    // method over riding 
    String Money = "10Lakhs";
    void Intro(){
        System.out.println("Hey i am second class");
        System.out.println(super.Money);
    }
}
public class PolymorphimsEx {
    // method overloading 
    static void add(int a, int b){
        System.out.println("1st method");
        System.out.println(a+b);
    }
    static void add(int a, int b, int c ){
        System.out.println("2nd method");
        System.out.println(a+b+c);
    }
    static void add(double a, int b){
        System.out.println("3rd method");
        System.out.println(a+b);
    }
    public static void main(String args[]){
        add(5,3);
        add(4,5,6);
        add(5d,7);
        Second obj = new Second();
        First obj1= new First();
        obj.Intro();
        obj1.Intro();
    }
}