package Problem2;

abstract public class Door {
    private String name;
	public Door(String name) {
		this.name=name;
	}
	abstract void unlock();
	

}
