/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Repositorios;

import java.util.List;
import Modelo.Principal.Client;
import Modelo.Principal.Product;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class RepositoryClients {

    private List<Client> Clients;

    public RepositoryClients() {
        Clients = new ArrayList<>();

    }

    public void getAllClients() {
        for (int i = 0; i < Clients.size(); i++) {
            if (Clients.get(i) instanceof Client) {
                System.out.println(Clients.get(i));
            }
        }
    }

    public Client searchClientByName(String name) {
        Client result = null;

        for (int i = 0; i < Clients.size(); i++) {
            if (Clients.get(i).getName() != null && !name.equals("")) {
                if (Clients.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                    result = Clients.get(i);
                }

            }
        }

        return result;
    }

    public Client searchClientByDNI(String DNI) {
        Client result = null;

        for (int i = 0; i < Clients.size(); i++) {
            if (Clients.get(i).getDNI() != null) {
                if (Clients.get(i).getDNI().toLowerCase().equals(DNI.toLowerCase())) {
                    result = Clients.get(i);
                }
            }
        }
        return result;
    }

    public Client updateClient(Client c) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el DNI nuevo");
        String newDNI=teclado.nextLine();
        c.setDNI(newDNI);
        System.out.println("Introduce el nuevo nombre");
        String nombre=teclado.nextLine();
        c.setName(nombre);
        System.out.println("Introduce la edad nueva");
        int newEdad=teclado.nextInt();
        c.setAge(newEdad);
        return c;
    }

    public boolean addClient(Client c) {
        boolean result = false;
        if (c != null) {
            Clients.add(c);
            result = true;

        }
        return result;

    }

    public boolean deleteClient(String dni) {
        boolean result=false;
        
        for(int i=0;i<Clients.size();i++){
            if(Clients.get(i).getDNI().equals(dni)){
                Clients.remove(i);
                result=true;
            }
        }
        return result;
    }
    
    public boolean deleteClient(Client c){
        boolean result=false;
        
        if(Clients.contains(c)==true){
            Clients.remove(c);
            result=true;
            
        }
       return result; 
    }
    
    

}
