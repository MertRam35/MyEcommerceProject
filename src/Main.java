import java.util.UUID;



public class Main {


    public static void main(String[] args) {

        Customer customer = new Customer(UUID.randomUUID(), "mert", "mert@mert.com");
        System.out.println("customer.getId() = " + customer.getUserName());
    DataGenerator.createCustomer();
     /*   createProduct();
        createCategory();
        createBalance();
        createDiscount();*/


    }


}
