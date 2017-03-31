import java.util.ArrayList;
import java.util.List;

/**
 * Created by UN on 17-03-2017.
 */
public class Party {
    public int id;
    public String name;
    public ArrayList<Customer> customers;
    public void askOrder(int serverId){
        System.out.println(" This server takes order from Party");
    }
    public void getAllCustomers(){
        if(customers!=null){
            for(int i=0;i<customers.size();i++){
                Customer c=(Customer)customers.get(i);
                System.out.println(" Name "+c.name);
            }
        }
    }
}
