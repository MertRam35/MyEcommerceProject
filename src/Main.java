import category.Category;

import java.util.Scanner;
import java.util.UUID;


public class Main {


    public static void main(String[] args) {

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
                        System.out.println("Category code : "+ category.generateCategoryCode()+" category name: "+ category.getName());
                    }
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
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

    private static String[] prepareMenuOptions() {

        return new String[]{"List Categories", "List Products", "List Discounts", "See Balance", "Add Balance", "Place an Order", "See Chart", "See order Details", "See your adress", "Close App"};


    }


}
