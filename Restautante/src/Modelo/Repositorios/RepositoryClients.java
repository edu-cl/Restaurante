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

/**
 *
 * @author migue
 */
public class RepositoryClients {

    private List<Client> Clients;

    public RepositoryClients() {

        Clients = new ArrayList<>();
        Clients.add(new Client( 0, DNI, name, 0));
        Clients.add(new Client( 0, DNI, name, 0));
        Clients.add(new Client( 0, DNI, name, 0));
        Clients.add(new Client( 0, DNI, name, 0));

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
        Client n = null;

        return n;
    }

    public boolean addClient(Client c) {
        return false;

    }

    public boolean deleteClient(String dni) {
        return false;

    }

}
