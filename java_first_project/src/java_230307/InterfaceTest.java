package java_230307;

public interface InterfaceTest {
	// public int num; 인터페이스는 변수 선언 불가
	public final int num = 0; //상수는 선언 가능
	int age = 10; //public final 생략가능
	
	public abstract void test1();
	public abstract void test2(int num);
	
	/* 일반 메소드 불가
	public void test3() {
		
	}
	*/
	

}	
