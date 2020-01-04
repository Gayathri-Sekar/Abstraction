package Problem3;

public class DarkStar extends Star{
	private int index,c,result=0; 
	public DarkStar(String starName, String constellationName, int decayIndex, int energyToEmit, int age,
			int energyconsume) {
		super(starName,constellationName,age,energyToEmit,energyconsume);
		index=decayIndex;
	}
	int  calculateYearsRemaining()
	{
		int num=1,i;
	    int count=0;
	 
	    while (count < index){
	      num=num+1;
	      for (i = 2; i <= num; i++){ //Here we will loop from 2 to num
	        if (num % i == 0) {
	          break;
	        }
	      }
	      if ( i == num){//if it is a prime number
	        count = count+1;
	      }
	    }
	    result=result + num;
	    return result;
	}

}
