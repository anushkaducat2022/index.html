import java.util.Scanner;

public class My_details {
	static String store_value1;
	

	public static void main(String[] args){
	
		System.out.println("Enter student details");
		 
		Scanner different_data = new Scanner(System.in);
		 
		Object store_value[] = new Object[5];
           
		for(int i=0; i <= store_value.length-1; i++) 
		{	
			  store_value1= different_data.nextLine();   
	    	 store_value[i] =store_value1;
	    	 
	    }
		  for(int i =0; i <=store_value.length-1; i++);
		  {
	
		    System.out.println(store_value[i]);
	
		  }
	}
}		
	
