//define a Loops class
public class Loops{
    //defin the main method to test our Loops class
    public static void main(String[] args){
        //declare our variables
        int x = 1;
        int z = 1;
    
        //define the do loop
        do {
            System.out.println("Printing X: "+x);
             x++;
        }while(x < 11);

        //define the for loop
        for (int y = 1; y < 11; y++){
            System.out.println("Printing Y: "+y);
        }
        
        //define the while loop
        while (z < 11){
            System.out.println("Printing Z: "+z);
            z++;
        }
    }
}