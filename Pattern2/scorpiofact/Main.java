import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

//        Scorpio s10 = new ScorpioClassic();
//        s10.drive();
//
//        ScorpioFactory factory = new ScorpioFactory();
//        Scorpio s12 = factory.createScorpio('N');
//        s12.drive();

        Collection <Scorpio> list = new ArrayList<>();
        Scorpio car1 = new ScorpioClassic();
        Scorpio car2 = new ScorpioN();
        list.add(car1);
        list.add(car2);

        for(Scorpio car : list){
            car.drive();
        }
    }
}