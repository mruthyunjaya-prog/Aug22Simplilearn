package mypackage;

class Encapsulate{
	private String name;
	private int rollNo;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate obj=new Encapsulate();
		obj.setName("Jay");
		obj.setAge(26);
		obj.setRollNo(555);
		System.out.println("My Name:"+obj.getName());
		System.out.println("Roll Number:"+obj.getRollNo());
		System.out.println("My Age:"+obj.getAge());
	}

}
