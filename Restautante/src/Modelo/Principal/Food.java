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
public class Food extends Product {

    private boolean ForVegans;

    public Food(String name, double price, boolean forCeliac, boolean veg) {
        super(name, price, forCeliac);
        this.ForVegans = veg;
    }

    public boolean isForVegans() {
        return ForVegans;
    }

    public void setForVegans(boolean ForVegans) {
        this.ForVegans = ForVegans;
    }
  

    @Override
    public boolean getBudlePack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "Food{" + "forVegans=" + ForVegans + '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (this == obj) {
            result = true;
        }
        if (obj != null && obj instanceof Food) {
            Product a = (Food) obj;
            if (this.getId() == a.getId()) {
                result = true;
            }
        }
        return result;
    }

}
