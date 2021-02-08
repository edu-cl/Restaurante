/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Principal;
import Modelo.Intefaces.IProduct;
import java.util.UUID;
/**
 *
 * @author migue
 */
public abstract class Product implements IProduct{
   UUID id;
   private String name;
   private double price;
   private boolean forCeliac;

    public Product(String name, double price, boolean forCeliac) {
        this.id=UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.forCeliac = forCeliac;
    }
   
   
   
    @Override
    public abstract boolean getBudlePack();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean getisForCeliac(){
        return forCeliac;
    }
}
