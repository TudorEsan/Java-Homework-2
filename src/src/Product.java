
public class Product implements Comparable<Product> {
    private double price;
    private String name;
    private int id;
    static int count = 0;
    private int days;

    public Product(String name, double price, int days) {
        this.name = name;
        this.setPrice(price); // apply price logic
        this.id = count++;
        this.days = days;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getPropperPrice(double price) {
        // price must be in increments of 0.5 if not round it to the nearest 0.5
        // for example 1.2 -> 1.0, 1.7 -> 1.5, 1.8 -> 2.0
        return Math.round(price * 2) / 2.0;
    }

    public void setPrice(double price) {
        this.price = getPropperPrice(price);
    }

    public void addDiscount() {
        if (this.days < 10) {
            return;
        }
        if (this.days < 20) {
            setPrice(this.price * 0.9);
            return;
        }
        setPrice(this.price * 0.8);
    }

    public String toString() {
        return this.name + " " + this.price;
    }

    // compare by price
    public int compareTo(Product other) {
        if (this.price < other.price) {
            return -1;
        }
        if (this.price > other.price) {
            return 1;
        }
        return 0;
    }
}