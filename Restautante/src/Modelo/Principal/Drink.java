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
public class Drink extends Product {

    private int[] BudlePack={};
    private boolean alcoholic;

    public Drink(String name, double price, boolean forCeliac, boolean ac) {
        super(name, price, forCeliac);
        this.BudlePack = BudlePack;
        this.alcoholic = ac;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public void setBudlePack(int[] BudlePack) {
        this.BudlePack = BudlePack;
    }

    @Override
    public int[] getBudlePack() {
        return BudlePack;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "Drink{" + "alcoholic=" + alcoholic + '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (this == obj) {
            result = true;
        }
        if (obj != null && obj instanceof Drink) {
            Product a = (Drink) obj;
            if (this.getId() == a.getId()) {
                result = true;
            }
        }
        return result;
    }

}
