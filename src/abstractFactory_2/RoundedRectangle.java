package abstractFactory_2;

/**
 * 2. 인터페이스 구현 class 생성 
 * 	2-1. Shape인터페이스를 구현한 RoundedRectangle클래스 생성
 *  둥근 직사각형
 * @date 		: 2021. 3. 23.
 */
public class RoundedRectangle implements Shape {
	
	@Override
	public void draw() {
		//RoundedRectangle의 draw 메소드 실행
		System.out.println("Inside RoundedRectangle : draw() method");
	}

}
