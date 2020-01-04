package Problem3;

public class RadiumStar extends Star{
	private int index,c;    
	public RadiumStar(String starName, String constellationName, int decayIndex, int energyToEmit, int age,
			int energyconsume) {
		super(starName,constellationName,age,energyToEmit,energyconsume);
		index=decayIndex;
	}
	int  calculateYearsRemaining()
	{
		c=(index*(index+1))/2;
		return c;
	}
}
