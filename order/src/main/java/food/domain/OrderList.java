package food.domain;

import food.domain.OrderPlaced;
import food.domain.OrderCanceled;
import food.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="OrderList_table")
@Data

public class OrderList  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){
        this.status = "OrderPlace";

        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }
    
    @PreRemove
    public void onPreRemove() throws Exception {
        if ("OrderPlace".equals(status) || "OrderAccept".equals(status)) {
            this.status = "OrderCancel";
            OrderCanceled orderCanceled = new OrderCanceled(this);
            orderCanceled.publishAfterCommit();
        } else {
            throw new Exception(this.status);
        }
    }

    public static OrderListRepository repository(){
        OrderListRepository orderListRepository = OrderApplication.applicationContext.getBean(OrderListRepository.class);
        return orderListRepository;
    }



    public void search(){
    }



}
