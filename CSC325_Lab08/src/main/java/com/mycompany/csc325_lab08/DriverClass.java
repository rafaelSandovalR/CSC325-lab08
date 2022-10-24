/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.csc325_lab08;

/**
 *
 * @author Rsand
 */
public class DriverClass {
    
    private static Order configureOrder(){
        
        Order order;
        ClothingFactory factory;
        
        
        String choice = "party";
        
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
