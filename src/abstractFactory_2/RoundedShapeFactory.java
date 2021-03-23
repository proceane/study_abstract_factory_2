package abstractFactory_2;

/**
 * 4. 추상팩토리를 확장한 클래스 생성
 * 여기는 둥근모양 만드는 공장
 * @date 		: 2021. 3. 23.
 */
public class RoundedShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {	
			//둥근 직사각형
			return new RoundedRectangle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")) {
			//둥근 정사각형
			return new RoundedSquare();
		}
		return null;
	}

}
