package Problem2;

public class LiqiudDoor extends Door {
	private int prime;
	public LiqiudDoor(String name, int prime) {
		super(name);
		this.prime=prime;	
	}
	public int getPrime() {
		return prime;
	}
	public void setPrime(int prime) {
		this.prime = prime;
	}
	void unlock()
	{
		 for (int i = 1; i <=prime*2; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(int num =i; num>=1; num--)
		       {
	             if(i%num==0)
		       {
	 		   counter = counter + 1;
		     }
		   }
		  if (counter ==2)
		   {
		     int result;
		     result=(int)Math.pow(2,i)-1;
		     System.out.print(" "+result);
		   }	
	      }	
	  }
}
