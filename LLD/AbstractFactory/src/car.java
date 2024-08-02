public class car {
    IEngine engine;
    IVehicleFactory carFactory;

    car(IVehicleFactory factory){
        carFactory = factory;
    }

    public void driveCar(){
        carFactory.createEngine();
        System.out.println("MILGAI GAADI MAARO CHILL");
    }
}
