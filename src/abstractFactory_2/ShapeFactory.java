package abstractFactory_2;

/**
 * 4. 추상팩토리를 확장한 클래스 생성
 * shapetype을 받아서 Shape을 반환
 * 모양 만들어달라고 하면 그 모양을 주는곳
 * 여기는 각진 모양 만드는 공장
 * @date 		: 2021. 3. 23.
 */
public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			//직사각형
			return new Rectangle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")) {
			//정사각형
			return new Square();
		}
		return null;
	}

}
