package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Picked extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Address address;
    private String status;

    public Picked(Delivery aggregate){
        super(aggregate);
    }
    public Picked(){
        super();
    }
}
