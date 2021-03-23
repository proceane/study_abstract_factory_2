package abstractFactory_2;

/**
 * 3. 추상 팩토리 클래스 생성
 * 모양들을 만드는(?) 공장같은 개념
 * @date 		: 2021. 3. 23.
 */
public abstract class AbstractFactory {
	
	//모양 타입을 입력하면 모양을 만들어줌
	abstract Shape getShape(String shapeType);
}
