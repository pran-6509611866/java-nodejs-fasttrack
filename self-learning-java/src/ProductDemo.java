import java.util.ArrayList;
import java.util.Scanner;

class Product {
    // Static field: นับจำนวนสินค้า
    private static int count = 0;

    // Instance fields
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        count++;
    }

    // Getter/Setter
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Static method: แสดงจำนวนสินค้า
    public static void printProductCount() {
        System.out.println("Total products: " + count);
    }

    // Instance method: แสดงข้อมูลสินค้า
    public void printInfo() {
        System.out.println("Product name: " + name + ", Price: " + price);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        // รับข้อมูลสินค้าจากผู้ใช้ 3 ชิ้น
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter product name #" + i + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter price for " + name + ": ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // clear buffer
            products.add(new Product(name, price));
        }

        // แสดงข้อมูลสินค้าทั้งหมด
        System.out.println("\nAll products:");
        for (Product p : products) {
            p.printInfo();
        }
        Product.printProductCount();

        // รับหมายเลข index จากผู้ใช้ แล้วแสดงรายละเอียดสินค้า
        System.out.print("\nEnter index of product to show details (0-" + (products.size() - 1) + "): ");
        int idx = scanner.nextInt();
        try {
            System.out.print("Product details: ");
            products.get(idx).printInfo();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. " + e.getMessage());
        }
        scanner.close();
    }
}