import java.util.Scanner;
public class Menu {
    public int getPrice(){
        System.out.println("----------MENU---------");
        System.out.println("Cold Coffee-----Rs 40");
        System.out.println("Pattice-----Rs 25");
        System.out.println("Fried Rice-----Rs 80");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item to order: ");
        String order = sc.next();
        int price = 0;

        if(order == "Cold Coffee"){
            price = 40;
        }

        if(order == "Pattice"){
            price = 25;
        }

        if(order == "Fried Rice"){
            price = 80;
        }

        return price;
    }
    
}
