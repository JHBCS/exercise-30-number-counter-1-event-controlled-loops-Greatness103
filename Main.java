// import files here as needed
 
 import java.text.DecimalFormat;	// needed for formatting output numbers
 import java.util.Scanner; //for input

 
 public class Main
 {  // begin class
 public static void main(String[] args)     
    {//begin main



 	// ********** declare constants **********
 	
 	
 	// *********** declare variables **********
 	int input;


	// ********* code needed for keyboard input ******
   	Scanner in = new Scanner(System.in);  //creates a Scanner object in

   	//sample code for loop priming
	System.out.print("Enter a number (0 to stop): ");
  	input = in.nextInt();
  
	//add loop here

while (input != 0){
  
  	System.out.print("Enter a number (0 to stop): ");
  	input = in.nextInt();

}

	
 	 									
 	// ********** closing message **********
 	
 	System.out.println("end of processing");
 	
 	}  // end main
 
 }  // end class

