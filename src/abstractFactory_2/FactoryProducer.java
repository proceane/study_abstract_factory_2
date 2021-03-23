package abstractFactory_2;

/**
 * 5. factory producer 생성
 * 공장을 관리하는곳 그런느낌?
 * 둥근거 만들어달라는 요청이 들어오면 둥근 공장을 소개시켜주는 그런곳
 * 어쨌든 요청에 따라 적절한 공장들을 리턴해주는 클래스
 * @date 		: 2021. 3. 23.
 */
public class FactoryProducer {
	
	//둥근 여부를 받아서 어느 공장을 가져올지 결정
	public static AbstractFactory getFactory(boolean rounded) {
		if(rounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}
	}
}
