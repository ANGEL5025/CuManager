import java.util.ArrayList;
import java.util.List;

public class CustomerOrderManager {

    // Se cambió el nombre de la clase y de las listas para mejorar la claridad.
    // Ahora se entiende claramente que maneja clientes y órdenes.

    private List<String> customers = new ArrayList<>();
    private List<String> orders = new ArrayList<>();

    // Renombramos el método para que el nombre sea descriptivo de la acción.
    public void addCustomer(String customerName) {
        customers.add(customerName);
        System.out.println("Added customer: " + customerName);
    }

    // renombramos el método y parámetro.
    public void addOrder(String order) {
        orders.add(order);
        System.out.println("Order added: " + order);
    }

    // Renombramos el método para que sea más expresivo sobre su acción.
    public void processOrdersForCustomer(String customerName) {
        System.out.println("Processing orders for: " + customerName);
        orders.forEach(order -> System.out.println("Processing order: " + order));
    }

    // Mejoramos la nomenclatura
    public void generateCustomerReport() {
        System.out.println("Customer Report");
        customers.forEach(customer -> System.out.println("Customer: " + customer));
    }

    public void generateOrderReport() {
        System.out.println("Order Report");
        orders.forEach(order -> System.out.println("Order: " + order));
    }

    public static void main(String[] args) {
        CustomerOrderManager manager = new CustomerOrderManager();
        manager.addCustomer("John Doe");
        manager.addCustomer("Jane Smith");
        manager.addOrder("Order1");
        manager.addOrder("Order2");
        manager.processOrdersForCustomer("John Doe");
        manager.generateCustomerReport();
        manager.generateOrderReport();
    }
}
