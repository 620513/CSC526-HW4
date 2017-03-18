import org.junit.Assert;
import org.junit.Test;

import java.sql.Time;

public class RestaurantTest {
    @Test
    public void isEmptyTableTest(){
        Restaurant restaurant = new Restaurant();
        Assert.assertTrue(restaurant.isEmptyTable());
    }
    @Test
    public void releaseTableTest(){
        Restaurant restaurant = new Restaurant();
        Assert.assertTrue(restaurant.releaseTable());
    }
}
