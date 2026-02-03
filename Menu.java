public class Menu {
    public int getPrice(String item){
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
