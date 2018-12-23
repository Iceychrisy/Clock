package exercises;

public class clock 
{
	  public static int[] timearray = new int[4];

	  public static void main(String args[]) throws InterruptedException 
	  {
		  int minutes = 0;
		  int hours = 0;
		  boolean clock = true;
		  
		  timearray[0] = 0; //hours tens
		  timearray[1] = 0; //hours ones
		  timearray[2] = 0; //minutes tens
		  timearray[3] = 0; //minutes ones
		  
		  printingArray();
		  
		  while (clock = true)
		  {
			  if(timearray[0] == 1 && timearray[1] == 2)
			  {
				  timearray[0] = 0;
				  timearray[1] = 0;
				  timearray[2] = 0;
				  timearray[3] = 0;
			  }
			  
			  if(timearray[1] == 9)
			  {
				  timearray[0]++;
				  timearray[1] = 0;
			  }
			  
			  if(timearray[2] == 6)
			  {
				  timearray[2]++;
				  timearray[3] = 0;
			  }
			  
			  if(timearray[3] == 9)
			  {
				  timearray[2]++;
				  timearray[3] = 0;
			  }
			  
			  else
			  {
				  timearray[3]++;
			  }
			  
			  printingArray();
			  
			  Thread.sleep(100);
		  }
	  }
	  
	  public static void printingArray()
	  {

		  System.out.print(timearray[0]);
		  System.out.print(timearray[1]);
		  System.out.print(":");
		  System.out.print(timearray[2]);
		  System.out.print(timearray[3]);
		  System.out.println("");
	  }
}
