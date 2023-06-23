import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    public static void createCustomer() {

        Address address1Customer1 = new Address("7925", "Jones Branch", "Suite 12", "35140", "Tr");
        Address address2Customer1 = new Address("825", "Jones Branch", "Suite 45", "35140", "Tr");
        Address address1Customer2 = new Address("6255", "Mike Smith", "Suite 50", "06140", "Tr");

        List<Address> customer1Addresslist = new ArrayList<>();
        customer1Addresslist.add(address1Customer1);
        customer1Addresslist.add(address2Customer1);
        Customer customer1 = new Customer(UUID.randomUUID(), "Mert", "mert@mert", customer1Addresslist);
        Customer customer2 = new Customer(UUID.randomUUID(), "Mert2", "mert@mert");


        StaticConstants.CUSTOMER_LIST.add(customer1);
        StaticConstants.CUSTOMER_LIST.add(customer2);
    }


}
