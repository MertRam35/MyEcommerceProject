import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@ToString
public class Customer {
    private UUID id;
    private String userName;
    private String email;
    private List<Address> address;

    public Customer(UUID id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public Customer(UUID id, String userName, String email, List<Address> address) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.address = address;
    }



}