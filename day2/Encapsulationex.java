// example of Encapsulation
class Account{
    private String accountNum="89883473343";
    public  String name= "Operation Placement";
    // getter method is used to access private properties 
    public String myAccount(){
        return accountNum;
    }
    // setter method is used to update the private properties 
    public void updateAccount(String newAccount){
        accountNum=newAccount;
    }

}
public class Encapsulationex {
    public static void main(String args[]){
        Account obj= new Account();
        System.out.println(obj.name);
        // System.out.println(obj.accountNum);
        System.out.println(obj.myAccount());
        obj.name="Nikhil";
        System.out.println(obj.name);
        // obj.accountNum="9328454239847"; 
        obj.updateAccount("47932743433435");
        System.out.println(obj.myAccount());
    }
}