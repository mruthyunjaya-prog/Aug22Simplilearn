package mypackage;

public class Dog {

	private String name;
	private String breed;
	private int age;
	private String color;
	public Dog(String name,String breed,int age,String color) {
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	
	
	@Override
	public String toString() {
		return "Hi my name is "+this.getName()+"\nMy breed, age and color are "
	+this.getBreed()+","+this.getAge()+" and "+this.getColor();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog scott=new Dog("scott","papillon",5,"black");
		System.out.println(scott.toString());
	}

}
