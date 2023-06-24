package balance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.management.ConstructorParameters;
import java.beans.ConstructorProperties;
import java.util.UUID;

@SuperBuilder
public class CustomerBalance extends Balance{

    @Override
    public Double addBalance(Double additionalBalance) {

        setBalance(getBalance()+additionalBalance);
        return getBalance();
    }


}
