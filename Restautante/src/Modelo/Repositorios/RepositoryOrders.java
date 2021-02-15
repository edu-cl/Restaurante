/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Repositorios;

import Modelo.Principal.Order;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author migue
 */
public class RepositoryOrders {
    public List<Order> orders;
    
    
    public void getAllOrders(){
        for(int i=0;i<orders.size();i++){
            if(orders.get(i) instanceof Order){
                System.out.println(orders.get(i));
            }
        }
    }
    public Order getOrdersByClient(String dni){
        Order result=null;
        for(int i=0;i<orders.size();i++){
            if(orders.get(i).getClient().getDNI().equals(dni)){
                result=orders.get(i);
            }
        }
        return result;
    }
    
    public Order getOrdersByDate(LocalDate ini,LocalDate end){
        Order result=null;
        
        return result;
    }
    
    public void getOrdersNoDelivered(){
        for(int i=0;i<orders.size();i++){
            if(orders.get(i).isDelivered()==false){
                System.out.println(orders.get(i));
            }
        }
    }
    public void getOrdersNoPayed(){
        for(int i=0;i<orders.size();i++){
            if(orders.get(i).isPayed()==false){
                System.out.println(orders.get(i));
            }
        }
    }
    
    /*public getAllInput(){
        
    }
    
    public getInputByDate(LocalDate ini,LocalDate end){
        
    }
    */
    
    
}
