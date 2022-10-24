/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_lab08;

/**
 *
 * @author Rsand
 */
class Order {
    
    private Tops tops;
    private Pants pants;
    private Shoes shoes;
    
    public Order(ClothingFactory factory){
        tops = factory.getTops();
        pants = factory.getPants();
        shoes = factory.getShoes();
    }
    
    public void showOrder(){
        tops.typeOfTop();
        pants.typeOfPants();
        shoes.typeOfShoes();
    }
}
