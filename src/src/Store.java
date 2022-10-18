import java.util.ArrayList;
import java.util.Collections;

public class Store {
    private ArrayList<Product> products;

    public Store() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void printProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " " + product.getPrice());
        }
    }

    public void updateProductDiscount() {
        for (Product product : products) {
            product.addDiscount();
        }
    }

    public void printProductsWithPriceHigherThan(double price) {
        for (Product product : products) {
            if (product.getPrice() > price) {
                System.out.println(product.toString());
            }
        }
    }

    public void printSortedProducts() {
        Collections.sort(products);
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    private Product getCheapestProduct() {
        Product cheapest = products.get(0);
        for (Product product : products) {
            if (product.getPrice() < cheapest.getPrice()) {
                cheapest = product;
            }
        }
        return cheapest;
    }

    private Product getMostExpensiveProduct() {
        Product mostExpensive = products.get(0);
        for (Product product : products) {
            if (product.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = product;
            }
        }
        return mostExpensive;
    }

    public void printMostExpensiveAndCheapestProduct() {
        System.out.println("Cheapest product: " + getCheapestProduct().toString());
        System.out.println("Most expensive product: " + getMostExpensiveProduct().toString());
    }


}