package Modelo.Repositorios;

import Modelo.Principal.Drink;
import Modelo.Principal.Food;
import Modelo.Principal.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositoryProduct {

    public List<Product> productos;

    public RepositoryProduct() {
        productos = new ArrayList<>();
        productos.add(new Drink("Coca Cola", 1.5, false, false));
        productos.add(new Drink("Nestea", 1, true, false));
        productos.add(new Drink("Larios", 1.5, true, true));
        productos.add(new Food("Kebab", 3.5, false, true));
        productos.add(new Food("Patatas", 1.5, true, true));
        productos.add(new Food("Pizza", 5, true, true));
    }

    public List<Product> getProductos() {
        return productos;
    }

    public void setProductos(List<Product> productos) {
        this.productos = productos;
    }

    public void getAllDrink() {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Drink) {
                System.out.println(productos.get(i));
            }
        }
    }

    public void getAllFood() {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Food) {
                System.out.println(productos.get(i));
            }
        }
    }

    public void getAllProducts() {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Product) {
                System.out.println(productos.get(i));
            }
        }
    }

    public void getAllNoAlcoholicDrink() {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Drink) {
                Drink aux = (Drink) productos.get(i);
                if (aux.isAlcoholic() == false) {
                    System.out.println(aux);
                }
            }
        }
    }

    public void getAllAlcoholicDrink() {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Drink) {
                Drink aux = (Drink) productos.get(i);
                if (aux.isAlcoholic() != false) {
                    System.out.println(aux);
                }
            }
        }
    }

    public void getAllForVegansFood() {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Food) {
                Food aux = (Food) productos.get(i);
                if (aux.isForVegans() != false) {
                    System.out.println(aux);
                }
            }
        }
    }

    public Product searchProduct(String name) throws Exception {
        Product result = null;

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getName() != null && !name.equals("")) {
                if (productos.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                    result = productos.get(i);
                }
            }

        }
        return result;
    }

    public Product searchDrinks(String name) {
        Product result = new Drink("Desconocido", 0, true, true);

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getName() != null && !name.equals("")) {
                if (productos.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                    if (productos.get(i) instanceof Drink) {
                        result = productos.get(i);
                    }
                }
            }

        }
        return result;
    }

    public Product searchFood(String name) {
        Product result = new Food("Desconocido", 0, true, true);

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getName() != null && !name.equals("")) {
                if (productos.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                    if (productos.get(i) instanceof Food) {
                        result = productos.get(i);
                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        RepositoryProduct rp1 = new RepositoryProduct();
        // System.out.println(rp1.productos);
        //rp1.getAllDrink();
        try {
            //System.out.println(rp1.searchProduct("Kebab"));
            System.out.println(rp1.searchDrinks("lArIoS"));
            System.out.println(rp1.searchFood("patatas"));
        } catch (Exception ex) {
            System.out.println("No se ha encontrado el producto");
        }
    }

}
