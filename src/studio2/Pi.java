package studio2;
import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  double radius;
		  double volume;

		  int num_circle = 0;
		  int num_square = 0;
		  
		  for(int n = 0; n<=100; n+=1) 
		  {
			 double x = Math.random()/2;
			 double y = Math.random()/2;
			
		    if (Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2))<=0.5) 
		    {
		    	num_circle += 1;
		    }
		    else {num_square += 1;}
		  }
          
		  double Pi = (double) (4*num_circle)/(num_circle+num_square);
		  System.out.println("The Pi is: " + Pi);
		  
		 }
}
