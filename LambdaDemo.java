package mypackage;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values=Arrays.asList(4,5,6,7,8,9);
//		System.out.println("Displaying using for");
//		for(int i=0;i<values.size();i++) {
//			System.out.println(values.get(i));
//		}
//		System.out.println("Displaying using speicalized for");
//		for(int i:values) {
//			System.out.println(i);
//		}
		System.out.println("Displaying using lambda expression");
		values.forEach(i->System.out.println(i));
	}
}
