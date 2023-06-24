package balance;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.management.ConstructorParameters;
import java.beans.ConstructorProperties;
import java.util.UUID;
@EqualsAndHashCode(callSuper = true)


public class CustomerBalance extends Balance{


    public CustomerBalance(UUID customerId, Double balance) {
        super(customerId, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {

        setBalance(getBalance()+additionalBalance);
        return getBalance();
    }


}
