/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Principal;

import java.util.Arrays;

/**
 *
 * @author migue
 */
public class Client extends Person{
    protected String[] adress;
    protected int[] order;
    private int points;

    public Client(int points, String DNI, String name, int age) {
        super(DNI, name, age);
        this.adress = adress;
        this.order = order;
        this.points = points;
    }

    public String[] getAdress() {
        return adress;
    }

    public void setAdress(String[] adress) {
        this.adress = adress;
    }

    public int[] getOrder() {
        return order;
    }

    public void setOrder(int[] order) {
        this.order = order;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (this == obj) {
            result = true;
        }
        if (obj != null && obj instanceof Drink) {
            Client a =  (Client) obj;
            if (this.getDNI()== a.getDNI()) {
                result = true;
            }
        }
        return result;
    }

    
    
}
