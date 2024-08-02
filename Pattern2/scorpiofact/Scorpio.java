import scorpiofact.IEngine;
import scorpiofact.IBodyshell;

public class Scorpio {


    IEngine engine;
    IBodyShell bodyShell;

    public void makeScorpio(){
        this.engine = new ScorpioEngine();
        this.bodyShell = new ScorpioBodyShell();
    }
    
    public void drive(){
        System.out.println("Diriving a scorpio");
    }

}
