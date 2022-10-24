/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_lab08;

/**
 *
 * @author Rsand
 */
public class CasualFactory implements ClothingFactory{

    @Override
    public Tops getTops() {
        return new CasualShirt();
    }

    @Override
    public Pants getPants() {
        return new CasualPants();
    }

    @Override
    public Shoes getShoes() {
        return new CasualShoes();
    }

}
