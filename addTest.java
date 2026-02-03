//import java.beans.Transient;
import org.junit.*;
public class addTest {
    @Test
    public void addTest1(){
        add add_var = new add();
        Assert.assertEquals(7, add_var.addNumbers(4, 3));
        Assert.assertEquals(11, add_var.addNumbers(5, 6));
        Assert.assertEquals(-6, add_var.addNumbers(-4, -2));
    }
}
