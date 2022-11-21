package food.external;

import lombok.Data;
import java.util.Date;
@Data
public class OrderList {

    private Long id;
    private String foodId;
    private Object address;
    private String status;
}


