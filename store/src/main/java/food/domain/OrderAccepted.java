package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String status;
    private Address address;

    public OrderAccepted(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderAccepted(){
        super();
    }
}
