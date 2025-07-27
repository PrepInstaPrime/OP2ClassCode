class SwitchCase {
    public static void main(String args[]){
        // switch case works on choice 
        /*
         * Write a java program which tell user the prices of the fruits 
         */
        String name= "Mango";
        switch(name){
            case "Apple":System.out.println("Apple Price: Rs. 100");
            break;
            case "Mango":System.out.println("Mango Price: Rs. 50");
            break;
            case "Oranges":System.out.println("Oranges Price: Rs. 150");
            break;
            case "Banana":System.out.println("Banana Price: Rs. 40");
            break;
            default: System.out.println("Invalid Input");
        }
    }
}