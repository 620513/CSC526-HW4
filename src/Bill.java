/**
 * Created by UN on 18-03-2017.
 */
public class Bill {
    private int id;
    private double orderPrice;
    private double tipPrice;
    public void getOrderPrice(){
        System.out.println("Order Price "+orderPrice);
    }
    public void totalPrice(){
        System.out.println("Total Price "+(orderPrice+tipPrice));
    }
    public void getTipPrice(){
        System.out.println("Tip Price "+tipPrice);
    }
}
