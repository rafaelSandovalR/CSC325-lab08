package com.mycompany.csc325_lab08;

/**
 *
 * @author Rafael Sandoval
 */
public class DriverClass {
    
    private static Order configureOrder(){
        
        Order order;
        ClothingFactory factory;
        
       
        String choice = "party";
        
        //Clothesfactory is an abstract factory
        //Professional, Party, and Casual factories produce
        //corresponding garments.
        if(choice=="professional"){
            factory = new ProfessionalFactory();
            order = new Order(factory);
        }

        else if (choice=="party"){
            factory = new PartyFactory();
            order = new Order(factory);
        }
        else{
            factory = new CasualFactory();
            order = new Order(factory);
        }
        
        return order;
    }

    public static void main(String[] args) {
        
        Order order = configureOrder();
        order.showOrder();
    }
}
