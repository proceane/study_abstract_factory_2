package abstractFactory_2;

/**
 * 6. 만든것들을 사용해보기
 * @date 		: 2021. 3. 23.
 */
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		//둥근공장같이 특정공장이 아니고 그냥 공장 그 자체
		//공장과 요청자를 연결시켜주는 중간다리 개념?
		//boolean값에 따라서 어느 카테고리의 공장이 연결될지 결정됨
		//안둥근 공장들 연결
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		
		//중간다리한테 Rectangle이라는 주문을 하고 받은 shape1
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		//물건이 잘 왔는지 결과 출력
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();
		
		//둥근 공장들 연결
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		
		Shape shape3 = shapeFactory1.getShape("RECTANGLE");
		shape3.draw();
		
		Shape shape4 = shapeFactory1.getShape("SQUARE");
		shape4.draw();
		
	}

}
