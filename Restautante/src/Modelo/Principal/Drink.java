/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Principal;

/**
 *
 * @author migue
 */
public class Drink extends Product{
    
    private boolean alcoholic;
    
    public Drink(String name, double price, boolean forCeliac, boolean ac) {
        super(name, price, forCeliac);
        this.alcoholic=ac;
    }

    @Override
    public boolean getBudlePack() {
        
    }
    
}
