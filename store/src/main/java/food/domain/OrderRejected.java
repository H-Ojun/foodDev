package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String foodId;
    private String status;
    private Address address;

    public OrderRejected(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderRejected(){
        super();
    }
}
