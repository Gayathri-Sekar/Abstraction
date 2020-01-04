package Problem1;

public class cuboidalPlanet extends Planet{
    private float height;
    private float width;
    private float length;
    private float result;
	public cuboidalPlanet(String planetname, float height, float width, float length) {
		super(planetname);
		this.height=height;
		this.width=width;
		this.length=length;	
	}
	public float getRadius() {
		return height;
	}
	public void setRadius(float height) {
		this.height = height;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	float calVol()
	{
		result=height*length*width;
		return result;
	}

}
