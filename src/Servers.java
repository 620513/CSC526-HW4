/**
 * Created by UN on 18-03-2017.
 */
public class Servers {
    private int id;
    private String name;
    private String typeOfEmployee;
    public void addtoTable(int id){
        this.id=id;
    }
    public void takeOrder(){
        System.out.println("Take order from party");
    }
    public void giveOrder(){
        System.out.println("Give order from party");
    }
}
