import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Laptop lap = new Laptop[4];
		for(int i=0; i<4; i++){
		     lap[i] = new Laptop();
		     int Id;
             String brand;
             String os; 
             double price;
             int rating
		     
		     id = scn.nextInt();
		     scn.nextLine();
             String brand = scn.nextLine();
             String os = scn.nextLine();
             double price = scn.nextDouble();
             int rating = scn.nextInt();
             scn.nextLine();
             
             lap[i].setLaptop(id,brand,os,price,rating);
		}
	}
}

class Laptop{
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;
    
    void setLaptop(){
        
    }
    
}