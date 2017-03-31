/**
 * Created by UN on 18-03-2017.
 */
public class OrderItems {
    private int id;
    private int qty;
    private int itemId;
    private int orderId;
    public void getOrderItems(){
        System.out.println("Id : "+id+" qty : "+qty);
    }
    public void getAllOrderItemsFromOrder(int orderId){
        System.out.println("All Order Items");
    }
}
