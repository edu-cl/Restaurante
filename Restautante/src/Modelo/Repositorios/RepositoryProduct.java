package Modelo.Repositorios;

import Modelo.Principal.Drink;
import Modelo.Principal.Food;
import Modelo.Principal.Product;
import java.util.ArrayList;

public class RepositoryProduct {

    public ArrayList<Product> productos;

    public RepositoryProduct() {
        productos = new ArrayList<>();
        productos.add(new Drink("Coca Cola", 1.5, false, false));
        productos.add(new Drink("Nestea", 1, true, false));
        productos.add(new Drink("Larios", 1.5, true, true));
        productos.add(new Food("Kebab", 3.5, false, true));
        productos.add(new Food("Patatas", 1.5, true, true));
        productos.add(new Food("Pizza", 5, true, true));
    }

    public ArrayList<Product> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Product> productos) {
        this.productos = productos;
    }

    public void getAllDrink() {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Drink) {
                System.out.println(productos.get(i));
            }
        }
    }

    
    
    
    public static void main(String[] args) {
        RepositoryProduct rp1 = new RepositoryProduct();
        // System.out.println(rp1.productos);
        rp1.getAllDrink();
    }

}
