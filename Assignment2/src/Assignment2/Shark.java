package Assignment2;

public class Shark extends Fish{
	private String habitat;
	public Shark() {
		super();
		this.habitat = "Sea";
	}
	public Shark(int age, String name, String habitat) {
		super(age, name);
		this.habitat = habitat;
	}
	public void greeting(){
		System.out.println("Hi, my appetizing friend... I live in "+ this.habitat+".");
	}
	
	public String toString(){
		return super.toString() + " habitat: " + habitat;
	}
	
	public void eatFish(Fish fish01) {
		System.out.println("You make me hungry! So... Let's take a look at the menu.");
		System.out.println("Menu: {"+fish01.toString()+"}");
		System.out.println("Got it! Then... Thank you for the meal!!");
		fish01 = null;
	}
	
}
