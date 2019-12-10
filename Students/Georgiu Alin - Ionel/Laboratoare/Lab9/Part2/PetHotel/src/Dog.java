
public class Dog {
	private String name;
	private String race;
	private boolean isAggressive;
	
	public Dog(String name,String race,boolean isAggressive) {
		this.name=name;
		this.race=race;
		this.isAggressive=isAggressive;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRace() {
		return this.race;
	}
	
	public boolean getIsAggressive() {
		return this.isAggressive;
	}
}
