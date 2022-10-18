public class Main {

    public static void main(String[] args) {

        Store store = new Store();

        store.addProduct(new Product("Milk", 100.1, 5));
        store.addProduct(new Product("Bread", 0.8, 15));
        store.addProduct(new Product("Butter", 2.0, 25));

        store.printProducts();
        System.out.println();

        store.updateProductDiscount();
        store.printProducts();
        System.out.println();

        store.printProductsWithPriceHigherThan(100.0);
        System.out.println();

        store.printSortedProducts();
        System.out.println();

        store.printMostExpensiveAndCheapestProduct();

    }
}