package mypackage;

class BaseClass{
	public void Add(int a,int b) {
		System.out.println("Base Class Sum:"+(a+b));
	}
	public void method2() {
		System.out.println("Base Class method");
	}
}
public class DerivedClass extends BaseClass{

	@Override
	public void Add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Derived clas Sum:"+(a+b));
	}
	public void Method1() {
		System.out.println("Derived class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass b=new BaseClass();
		b.Add(10, 20);
		
		DerivedClass d=new DerivedClass();
		d.Add(10,20);

		//by assigning a derivedclass object to a base class variable
		//we were able to call a derived class method because of overriding
		BaseClass b1=new DerivedClass();
		b1.Add(10, 20);
		b1.method2();
		
}
}
