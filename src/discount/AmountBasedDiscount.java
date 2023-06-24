package discount;

import lombok.Getter;

import java.util.UUID;
@Getter
public class AmountBasedDiscount extends Discount {

    private Double discountAmount;

    public AmountBasedDiscount(UUID id, String name, Double thresholdAmount, Double discountAmount) {
        super(id, name, thresholdAmount);
        this.discountAmount = discountAmount;
    }

    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {



        return null;
    }


}
