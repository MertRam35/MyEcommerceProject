package balance;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class GiftBalance extends Balance {
    @Override
    public Double addBalance(Double additionalBalance) {

        double promotionAmount = additionalBalance * 10 / 100;
        setBalance(getBalance() + additionalBalance+promotionAmount);
        return getBalance();
    }
}
