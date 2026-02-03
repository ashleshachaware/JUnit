import org.junit.*;

public class MenuTest {
    @Test
    public void MenuTest1(){
        Menu menu = new Menu();
        Assert.assertEquals(40, menu.getPrice("Cold Coffee"));
        Assert.assertEquals(25, menu.getPrice("Pattice"));
        Assert.assertEquals(80, menu.getPrice("Fried Rice"));
    }
    
}
