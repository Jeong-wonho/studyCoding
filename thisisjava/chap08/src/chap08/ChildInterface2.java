package chap08;

public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2() {
		System.out.println("method2 ������");
	}
	public void method3();
}
