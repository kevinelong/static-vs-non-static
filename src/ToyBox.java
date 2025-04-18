import java.util.ArrayList;

public class ToyBox {
    ArrayList<Toy> inventory;
    ToyBox(){
        inventory = new ArrayList<Toy>();
    }
    void add(Toy toy){
        inventory.add(toy);
    }
    void show(){
        for(Toy t : inventory){
            System.out.println(t);
        }
    }
}
