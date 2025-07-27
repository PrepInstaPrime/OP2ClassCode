class Parent{
    String name="parent";
    String car="Honda city";
    int money = 10000;
}
class Child extends Parent{
    void intro(){
        System.out.println("Hey i am child");
    }
}
public class Inheritance {
    public static void main(String args[]){
        Child obj= new Child();
        System.out.println(obj.car);
        obj.intro();
    }
}