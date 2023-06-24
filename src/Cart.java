import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.UUID;
@AllArgsConstructor
@Getter
@Setter
public class Cart {

    private Customer customer;
    private UUID discountId;
    private Map<Product,Integer> productMap;
    public Cart(Customer customer){
        this.customer = customer;
    }

    public Double calculateCartTotalAmount(){

        double totalAmount=0;
        for (Product product : productMap.keySet()) {
            totalAmount += product.getPrice()* productMap.get(product);
        }
        return totalAmount;
    }
}
