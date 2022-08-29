package mypackage;

interface First{
	void Greet(String name);
}
interface Second{
	void Show();
}
public class TestClass implements First,Second {
	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("Interface second method show implemented");
	}

	@Override
	public void Greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("Interface First method Greet implemented "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass obj=new TestClass();
		obj.Greet("Jay");
		obj.Show();
		
		First f=new TestClass();
		f.Greet("Mohit Tomar");
		
		Second s=new TestClass();
		s.Show();
		
	}

}
