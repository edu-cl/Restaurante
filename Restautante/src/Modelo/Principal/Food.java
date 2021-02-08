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
public class Food extends Product{
    public boolean forVegans;
    public Food(String name, double price, boolean forCeliac, boolean veg) {
        super(name, price, forCeliac);
        this.forVegans=veg;
    }

    @Override
    public boolean getBudlePack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
