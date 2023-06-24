package balance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@Data
@SuperBuilder
public abstract class Balance {
    private UUID customerId;
    private Double balance;

    public abstract Double addBalance(Double additionalBalance);


}
