import balance.Balance;
import balance.CustomerBalance;
import balance.GiftCardBalance;
import category.Category;
import category.Electronic;
import category.Furniture;
import category.SkinCare;

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

    public static void createCategory() {

         Category category1 = new Electronic(UUID.randomUUID(),"Electronic");
         Category category2 =new Furniture(UUID.randomUUID(),"Furniture");
         Category category3 = new SkinCare(UUID.randomUUID(),"Skincare");

        StaticConstants.CATEGORY_LIST.add(category1);
        StaticConstants.CATEGORY_LIST.add(category2);
        StaticConstants.CATEGORY_LIST.add(category3);



    }
    public static void createProduct(){

        Product product1 = new Product(UUID.randomUUID(),"PS5",15.4,8,8,StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product2 = new Product(UUID.randomUUID(),"XBOX",20.4,10,4,StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product3 = new Product(UUID.randomUUID(),"Chair",30.4,15,8,StaticConstants.CATEGORY_LIST.get(1).getId());

        StaticConstants.PRODUCT_LIST.add(product1);
        StaticConstants.PRODUCT_LIST.add(product2);
        StaticConstants.PRODUCT_LIST.add(product3);


    }
    public static void createBalance(){

        Balance customerBalance = new CustomerBalance(StaticConstants.CUSTOMER_LIST.get(0).getId(),450.0);
        Balance giftCardBalance = new GiftCardBalance(StaticConstants.CUSTOMER_LIST.get(1).getId(),750.0);

        StaticConstants.BALANCE_LIST.add(customerBalance);
        StaticConstants.BALANCE_LIST.add(giftCardBalance);


    }
}
