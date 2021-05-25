package beggining.Arrays;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Product implements Comparable<Product> {

    private final String brand;
    private final String name;
    private final long serialNumber;
    private final LocalDateTime creationDate;

    public Product(String brand, String name, long serialNumber, LocalDateTime creationDate) {
        if (brand == null || name == null || serialNumber == 0 || creationDate == null) {
            throw new IllegalArgumentException();
        }
        this.brand = brand;
        this.name = name;
        this.serialNumber = serialNumber;
        this.creationDate = creationDate;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return serialNumber == product.serialNumber &&
                brand.equals(product.brand) &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, name, serialNumber);
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                ", creationDate=" + creationDate +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Set<Product> products = new TreeSet<>(new SerialNumberComparator().reversed());
        products.add(new Product("СуперБренд", "Колбаса", 5L, LocalDateTime.now()));
        products.add(new Product("ЛучшийБренд", "Сыр", 2L, LocalDateTime.now()));
        products.add(new Product("Бренд", "Колбаса", 3L, LocalDateTime.now()));
        products.add(new Product("Лучший", "Сыр", 6L, LocalDateTime.now()));
        products.add(new Product("1", "Колбаса", 4L, LocalDateTime.now()));
        products.add(new Product("2", "Сыр", 4L, LocalDateTime.now()));
        for (Product product : products) {
            System.out.println(product.getSerialNumber() + " " +product.getBrand() + " " + product.getName());
        }
    }
    }

