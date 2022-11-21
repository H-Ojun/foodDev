package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderFinished extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String foodId;
    private String status;
}


