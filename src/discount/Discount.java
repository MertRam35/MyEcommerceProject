package discount;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;
@AllArgsConstructor
@Getter
public abstract class Discount {

    private UUID id;
    private String name;
    private Double thresholdAmount;

public abstract Double calculateCartAmountAfterDiscountApplied(Double amount);



}
