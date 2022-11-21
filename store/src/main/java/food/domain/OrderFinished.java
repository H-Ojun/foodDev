package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderFinished extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String foodId;
    private String status;

    public OrderFinished(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderFinished(){
        super();
    }
}
