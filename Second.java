import java.util.*;
import java.util.Scanner;

public class Second {
    
    public static int findCube(int num){
        int ans = num*num*num;
        return ans;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter a Int");
        
        int a;
        int b;
        a = scn.nextInt();
        b = scn.nextInt();
        int sum = 0;
        for(int i = a; i<b; i++){
            sum += findCube(i);
        }
        
        
        System.out.println("Ans Is " + sum);
    }

}
