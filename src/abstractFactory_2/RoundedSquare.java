package abstractFactory_2;

/**
 * 2. 인터페이스 구현 class 생성 
 * 	2-1. Shape인터페이스를 구현한 RoundedSquare클래스 생성
 *  둥근 정사각형
 * @date 		: 2021. 3. 23.
 */
public class RoundedSquare implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside RoundedSquare : draw() method");
	}

}
