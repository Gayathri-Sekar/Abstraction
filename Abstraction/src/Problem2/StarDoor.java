package Problem2;

public class StarDoor extends Door{
    private int star;
	public StarDoor(String name, int star) {
		super(name);
		this.star=star;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	void unlock()
	{
		for(int i=star;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");	
		}
	//	System.out.print("\n");
		for(int i=1;i<=star;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
	}
	}

}
