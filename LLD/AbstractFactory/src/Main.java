import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        IVehicleFactory factory1 = new ScorpioFactory();
        IVehicleFactory factory2 = new DefenderFactory();
        car car1 = new car(factory1);
        car car2 = new car(factory2);

        Collection<car> list= new ArrayList<>();

        list.add(car1);
        list.add(car2);

        for (car c : list){
            c.driveCar();
        }
    }
}
