import java.lang.reflect.Array;
import java.util.ArrayList;

import co.grandcircus.Formation;
import co.grandcircus.Mesa;
import co.grandcircus.Mountain;

public class App {
    public static void main(String[] args) throws Exception {
    ArrayList<Formation> mountainsAndMesas = new ArrayList<>();
    // creating instances
    Mountain mountain1 = new Mountain(29000, "Mt. Everest");
    Mountain mountain2 = new Mountain(14400, "Mt. Rainer");
    Mountain mountain3 = new Mountain(6600, "Appalachian Mountains");
    Mesa mesa1 = new Mesa(6000, "Grand Mesa", 500);
    Mesa mesa2 = new Mesa(5800, "Battlement Mesa", 7400);
    Mesa mesa3 = new Mesa(6500, "North Table Mesa", 2000);

    public static void showInfo(ArrayList<Formation> x){
        for (Formation formation : x) {
            return System.out.println(formation.getInfo());
        }
    }
        










    }
}
