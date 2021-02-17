/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Intefaces;

import Modelo.Principal.Order;
import Modelo.Principal.Product;

/**
 *
 * @author migue
 */
public interface IOMController {
    public Product addProduct();
    public Order editLine();
    public Order removeLine();
    public Order setAdress(String a);
    public void savePaid();
    public void saveNoPaid();
}
