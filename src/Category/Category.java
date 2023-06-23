package Category;

import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;
@Getter
public abstract class Category {

    private UUID id;
    private  String name;

    public Category(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract LocalDate findDeliveryDueDate();

    public  String generateCategoryCode(){
        return id.toString().substring(0,8).concat("-").concat(name.substring(0,2));
    };
}
