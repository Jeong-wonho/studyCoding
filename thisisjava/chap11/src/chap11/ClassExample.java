package chap11;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getCanonicalName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
	
	
	try {
		Class clazz2 = Class.forName("chap11.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
