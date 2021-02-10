/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Repositorios;

import java.util.List;
import Modelo.Principal.Client;
import java.util.ArrayList;
/**
 *
 * @author migue
 */
public class RepositoryClients {
    private List<Client> Clients;
    
    public RepositoryClients() {
        Clients = new ArrayList<>();
        Clients.add(new Client(adress, order, 0, DNI, name, 0));
        Clients.add(new Client(adress, order, 0, DNI, name, 0));
        Clients.add(new Client(adress, order, 0, DNI, name, 0));
        Clients.add(new Client(adress, order, 0, DNI, name, 0));

    }
    public void getAllClients(){
        
    }
    
    public Client searchClientByName(String name){
        Client n=null;
        
        return n;
    }
    
    public Client searchClientByDNI(String DNI){
        Client n=null;
        
        return n;
    }
    
    public Client updateClient(Client c){
        Client n=null;
        
        return n;
    }
    
    public Client addClient(Client c){
        Client n=null;
        
        return n;
    }
    
    public void deleteClient(String dni){
        
    }
    
}
