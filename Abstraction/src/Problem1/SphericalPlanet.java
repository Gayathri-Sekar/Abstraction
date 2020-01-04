package Problem1;

public class SphericalPlanet extends Planet{
	private float radius;
	 private float result;
	public SphericalPlanet(String planetname, float radius) {
		super(planetname);
		this.radius=radius;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	float calVol()
	{
		result=(4*(float)3.14*radius*radius)/3;
		return result;
	}

}
