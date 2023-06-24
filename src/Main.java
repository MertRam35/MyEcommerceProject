import balance.Balance;
import balance.CustomerBalance;
import balance.GiftCardBalance;
import category.Category;
import discount.Discount;

import java.util.Scanner;
import java.util.UUID;


public class Main {


    public static void main(String[] args)  {

        //  Customer customer = new Customer(UUID.randomUUID(), "mert", "mert@mert.com");

        DataGenerator.createCustomer();
        DataGenerator.createCategory();
        DataGenerator.createBalance();
        DataGenerator.createDiscount();
        DataGenerator.createProduct();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Customer");

        for (int i = 0; i < StaticConstants.CUSTOMER_LIST.size(); i++) {
            System.out.println("Type " + i + " for customer: " + StaticConstants.CUSTOMER_LIST.get(i).getUserName());

        }


        Customer customer = StaticConstants.CUSTOMER_LIST.get(scanner.nextInt());

        System.out.println(customer);
        while (true) {
            System.out.println("What would you like to do ? Just type id for selection");
            for (int i = 0; i < prepareMenuOptions().length; i++) {
                System.out.println(i + " - " + prepareMenuOptions()[i]);
            }
            int menuSelection = scanner.nextInt();

            switch (menuSelection) {
                case 0:
                    for (Category category : StaticConstants.CATEGORY_LIST) {
                        System.out.println("Category code : " + category.generateCategoryCode() + " category name: " + category.getName());
                    }
                    break;
                case 1:
                    try {    for (Product product : StaticConstants.PRODUCT_LIST) {
                        System.out.println("product name :" + product.getName() + "product category name :" + product.getCategoryName());
                    }

                    }catch (Exception e){
                        System.out.println("Product could not printed because category not found for product name : "+e.getMessage().split(",")[1]);
                    }
                    break;
                case 2:
                    for (Discount discount : StaticConstants.DISCOUNT_LIST) {
                        System.out.println("Discount Name :"+discount.getName()+ " discount threshold amount :"+discount.getThresholdAmount());
                    }
                    break;
                case 3:
                    CustomerBalance cBalance  = findCustomerBalance(customer.getId());
                    GiftCardBalance gBalance = findGiftCardBalance(customer.getId());
                    double totalBalance = cBalance.getBalance()+gBalance.getBalance();
                    System.out.println("totalBalance = " + totalBalance);
                    System.out.println("customer Balance = " + cBalance.getBalance());
                    System.out.println("Gift Card Balance = " + gBalance.getBalance());
                    for (Balance balance : StaticConstants.BALANCE_LIST) {
                        System.out.println("balance = " + balance.getBalance());
                    }
                    for (Balance balance : StaticConstants.GIFT_CARD_BALANCE_LIST) {
                        System.out.println("Gift Card balance = " + balance.getBalance());
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }

        }

    }

    private static GiftCardBalance findGiftCardBalance(UUID customerId) {

        for (Balance giftCardBalance : StaticConstants.GIFT_CARD_BALANCE_LIST) {
            if (giftCardBalance.getCustomerId().toString().equals(customerId.toString())){
                return (GiftCardBalance) giftCardBalance;
            }
        }
        GiftCardBalance giftCardBalance = new GiftCardBalance(customerId,0d);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);
        return giftCardBalance;
    }

    private static CustomerBalance findCustomerBalance(UUID customerId) {

        for (Balance balance : StaticConstants.BALANCE_LIST) {
            if (balance.getCustomerId().toString().equals(customerId.toString())){
                return (CustomerBalance) balance;
            }


        }
       CustomerBalance customerBalance = new CustomerBalance(customerId,0d);
        StaticConstants.BALANCE_LIST.add(customerBalance);
        return customerBalance;
    }

    private static String[] prepareMenuOptions() {

        return new String[]{"List Categories", "List Products", "List Discounts", "See Balance", "Add Balance", "Place an Order", "See Chart", "See order Details", "See your adress", "Close App"};


    }


}
