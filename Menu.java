import java.util.Scanner;
public class Menu {
    public int getPrice(String item){
        System.out.println("----------MENU---------");
        System.out.println("Cold Coffee-----Rs 40");
        System.out.println("Pattice-----Rs 25");
        System.out.println("Fried Rice-----Rs 80");
        
        Scanner sc = new Scanner(System.in);
        int price = 0;

        if(item == "Cold Coffee"){
            price = 40;
        }

        if(item == "Pattice"){
            price = 25;
        }

        if(item == "Fried Rice"){
            price = 80;
        }

        return price;
    }
    
}
