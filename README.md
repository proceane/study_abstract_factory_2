# study_abstract_factory_2
abstract factory study1

두번째 추상팩토리 패턴 공부

# Reference
https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm

# 이전과의 차이점
- FactoryProducer
  처음 공부했을때는 FactoryProducer에 해당하는 클래스를 만들지 않았음
  Factory에 해당하는 자판기 클래스를 1개만 만들어서 FactoryProducer 필요성을 못 느꼈음
  
  오늘 공부했을때는 Factory종류가 2가지였음
  그래서 Factory와 요청주체를 연결해주는 매개체인 FactoryProducer를 만듬
  출처에는 이에 대한 설명으로 
  
  >  our demo class uses FactoryProducer to get a AbstractFactory object. 
  
  라고 나와있음
  AbstractFactory객체를 얻기 위해 사용하는게 FactoryProducer라고 함
  다이렉트로 공장에 요청보내는게 아니라는 의미인듯

- Factory의 용도
  Factory = 재료들을 조합한 객체를 반환해주는 클래스
  이렇게 생각하고 작업했었는데 이게 아니었음
  
  공장 인터페이스를 만들어서 콜라 공장을 만들고 콜라공장에서 재료를 조합하는 작업을 하게 만든다음
  요청자가 콜라를 주문하면 콜라공장에서 재료를 조합해서 콜라라는 객체를 반환하도록 했음
  
  바꿔야 하는 내용은
  1. 공장이 하는일
    공장에서 재료를 생산하여 조합한 객체 반환 -> 그냥 객체 그 자체를 반환
    콜라만들어주세요 하면 그냥 완성품 콜라를 반환해야함
    공장에서 시럽이랑 탄산을 섞는게 아님
  2. 그러면 재료는 어디서 섞음?
    출처에는 이 내용에 대한게 없었음
    추상팩토리 패턴에서 정의하는게 아니라서 그럴거라고 예상
    
    그냥 내 생각으로는 콜라 재료는 콜라 클래스에서 섞어야하는듯
    다음에 다른 패턴이나 개념 공부하다가 관련 내용 나오면 내용 추가하기로 함
    
 - 그래서 이전 공부한 내용의 로직을 어떻게 바꿀까?
  이전 로직 : 주문자가 탄산음료 자판기에서 음료를 주문하면(음료명을 입력하면) 자판기에서느 음료 객체를 생성하여 반환한다.
              음료 객체는 재료 공장에서 생산된 재료들을 음료 공장에서 조합하여 만들어진다.
  
  변경 로직 : 주문자가 그냥 자판기(FactoryProducer)를 통해서 음료를 주문하면 자판기는 요청에 따라 어느 Factory를 연결할지 결정한다. 
              연결된 공장에서 요청에 맞는 객체를 생성하여 반환한다. 그 객체를 사용한다.
  
  요청자가 받을 최종 객체의 생산주체가 바뀌고, 공장이 단순화될수 있을듯.


# 새롭게 알게된 내용
- equalsIgnoreCase(String str)
  대소문자 무시하고 비교할수 있는 메소드
  
  
  
