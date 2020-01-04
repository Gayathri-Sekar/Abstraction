package Problem3;

public class PlasmaStar extends Star{
     private int index,c;     
	public PlasmaStar(String starName, String constellationName, int decayIndex, int energyToEmit, int age,
			int energyconsume) {
		super(starName,constellationName,age,energyToEmit,energyconsume);
		index=decayIndex;
	}
	int  calculateYearsRemaining()
	{
		int a=0,b=1;
		for(int i=1;i<=index-1;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
		return c;
	}

}
