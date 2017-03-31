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
    public void bookingTable(){
        System.out.println("Book Table "+party.name);
    }
    public boolean isEmptyTable(){
        if(tableList!=null){
            for(int i=0;i<tableList.size();i++){
                Table table=(Table)tableList.get(i);
                if(!table.isBooked()){
                    return true;
                }
            }
        }
        return false;
    }
    public void areAllTablesReserved(){
        if(tableList!=null){
            for(int i=0;i<tableList.size();i++){
                Table table1=(Table)tableList.get(i);
                if(table1.isBooked()){
                    System.out.println("this table is reserved");
                }
            }
        }
    }
    public boolean releaseTable(){
        if(tableList!=null){
            for(int i=0;i<tableList.size();i++){
                Table tablerelease=(Table)tableList.get(i);
                if(!tablerelease.isBooked()){
                    System.out.println("table is releasedd");
                    return true;
                }
            }
        }
        return false;
    }
    public void bill(){System.out.println("Bill Information");}
    public ArrayList getItemsList(){return itemList;}
}
