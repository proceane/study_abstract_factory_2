package abstractFactory_2;

/**
 *  2. 인터페이스 구현 class 생성 
 * 	2-1. Shape인터페이스를 구현한 Square클래스 생성
 *  정사각형
 * @date 		: 2021. 3. 23.
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square : draw() method");
	}

}
