package java_230304;

import test2.TestClass;

public class TestClass2 extends TestClass{
	public void test() {
		this.n = 1; //n은 protected라 자식이 불러오는 것 가능
		//this.n2 = 2; n2는 default라 자식도 불가능, 같은 패키지만 가능
	}
}
