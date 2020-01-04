package Problem3;

abstract public class Star {
    private String name;
    private String consname;
    private int current;
    private int emit;
    private int consume;
	public Star(String starName, String constellationName, int age, int energyToEmit,int energyconsume) {
		name=starName;
		consname=constellationName;
		current=age;
		emit=energyToEmit;
		consume=energyconsume;
	}
	abstract int  calculateYearsRemaining();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConsname() {
		return consname;
	}

	public void setConsname(String consname) {
		this.consname = consname;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getEmit() {
		return emit;
	}

	public void setEmit(int emit) {
		this.emit = emit;
	}

	public int getConsume() {
		return consume;
	}

	public void setConsume(int consume) {
		this.consume = consume;
	}

	private float result;
	public float calculateEmissionRate()
	{
		 result=(float)(emit-consume)/(float)(calculateYearsRemaining()-current);  
		 return result;
	}
	public void display()
	{
		System.out.print("Star Details:"+name+"\n");
		System.out.print("Constellation:"+consname+"\n");
		System.out.print("Emission rate:"+result);
	}
            
}


