import java.util.ArrayList;

/**
 * Created by UN on 17-03-2017.
 */
public class Restaurant {
    private ArrayList<Table> tableList;
    private Party party;
    private int tableQueue;
    private ArrayList<Items> itemList;
    public void newPartyTable(){
        party=new Party();
        party.id=1;
        party.name="test";
        ArrayList<Customer> customers=new ArrayList<Customer>();
        Customer customer1=new Customer();
        customers.add(customer1);
        Customer customer2=new Customer();
        customers.add(customer2);
    }
    public void bookingTable(){}
    public boolean isEmptyTable(){ return true;}
    public void areAllTablesReserved(){}
    public boolean releaseTable(){return true;}
    public void bill(){}
    public ArrayList getItemsList(){return null;}
}
