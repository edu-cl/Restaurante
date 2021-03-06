/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Principal;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {

    protected List<String> adress;
    protected List<Integer> order;
    private int points;

    public Client(String DNI, String name, int age, int points) {
        super(DNI, name, age);
        this.adress = new ArrayList<>();
        this.order = new ArrayList<>();
        this.points = points;
    }

    public List<String> getAdress() {
        return adress;
    }

    public void setAdress(List<String> adress) {
        this.adress = adress;
    }

    public List<Integer> getOrder() {
        return order;
    }

    public void setOrder(List<Integer> order) {
        this.order = order;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return super.toString()+"Client{" + "adress=" + adress + ", order=" + order + ", points=" + points + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (this == obj) {
            result = true;
        }
        if (obj != null && obj instanceof Drink) {
            Client a = (Client) obj;
            if (this.getDNI().equals(a.getDNI())) {
                result = true;
            }
        }
        return result;
    }

}
