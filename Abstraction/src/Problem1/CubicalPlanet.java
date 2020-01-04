package Problem1;

public class CubicalPlanet extends Planet{
        private float side;
        private float result;
	public CubicalPlanet(String planetname, float side)  {
		super(planetname);
		this.side=side;
	}
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}
	float calVol()
	{
		result=side*side*side;
		return result;
	}
}
