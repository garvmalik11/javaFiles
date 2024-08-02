import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Laptop[] lap = new Laptop[4];

        for(int i=0; i<lap.length; i++){
            lap[i] = new Laptop();
            //System.out.println("Enter details for laptop" + (i + 1) + ":");

            int id = scn.nextInt();
            scn.nextLine();
            String brand = scn.nextLine();
            String osType = scn.nextLine();
            double price = scn.nextDouble();
            int rating = scn.nextInt();
            scn.nextLine();

            lap[i].setter(id, brand, osType, price, rating);
            //lap[i].getter();
        }
        String targetBrand = scn.next().toLowerCase();

        String targetOs = scn.next().toLowerCase();


        Laptop.countOfLaptopByBrand(lap, targetBrand);
        Laptop.searchLaptopByOsType(lap, targetOs);
    }
}

class Laptop{
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;


    public void getter(){
        for(int i = 0; i<4; i++) {
            System.out.println(laptopId+brand+osType+price+rating);
        }
    }
    public void setter(int id, String brand, String os, double price, int rating){
        this.laptopId = id;
        this.brand = brand.toLowerCase();
        this.osType = os.toLowerCase();
        this.price = price;
        this.rating = rating;
    }

    public static void countOfLaptopByBrand(Laptop[] lap, String target){
        int count = 0;
        for(int i=0;i <lap.length; i++){
            if(lap[i].brand.equals(target)){
                count++;
            }
        }
        if (count > 0){
            System.out.println("COUNT IS " + count);
        }
        else{
            System.out.println("SORRY NO BRAND");
        }
    }

    public static void searchLaptopByOsType(Laptop[] lap, String target){
        int count=0;
        for(int i= lap.length; i>0; i--) {

            if (lap[i].osType.equals(target)) {
                count++;
                System.out.println(lap[i].laptopId);
                System.out.println(lap[i].rating);
            }
        }
        if(count == 0){
            System.out.println("Soryy");
        }
    }
}
