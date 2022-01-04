package JAVA.CLASS;
//클래스란 무엇인가?
//클래스란 객체(또는 인스턴스)를 생성하는 하나의 공장(틀 프레임 템플릿)이다.
//시골 벌판에 농기계를 만들어내는 공장(class)가 있고 농부들이 주문을 넣으면 농기계가 만들어져 나온다. -->이것이 객체
//자동차 클래스(공장 )

//클래스 공장을 통해서 객체를 어떻게 만드는건가?
// 예를들면 어떤 농부가 경작용 트랙터를 주문한다고 하면 가격을 고민하고, 색상도 고민하고 연식도 고민할 것이다.
//뿐만 아니라 트랙터의 기능이나 성능 등 동작들에 대해서도 많은 고민을 할것이다.
// 고민하는걸 2개 정도 압축하면 크게 봤을때 특징과 동작이 된다.
// 클래스는 이러한 만들고자 하는 객체의 특징과 동작에 많은 시간을 들이고 집중하면서 설계를 하게된다.
//객체는 참조형 타입으므로 주소값이 출력됨

// 위사항들을 어려운말로 정의한다면
//객체의 특징 속성(attribute)
//객체의 동작 메서드(method) -->함수와 거의 동일
//참고로 파이썬에서는 함수라는 표현을 쓰지만 클래스내에서의 함수는 메서드라고 부른다. 함수와 동일하다.
public class Java100_oop_001 {
    public static void main(String[] args) {
        FarmMachine farmMachine = new FarmMachine();
        farmMachine.price = 10000000;
        farmMachine.year = 2022;
        farmMachine.color = "red";


        farmMachine.move();
        farmMachine.dig();
        farmMachine.grind();
        System.out.println(String.format("%,d",farmMachine.price));//천단위 콤마 찍기
        System.out.println(farmMachine.year);
        System.out.println(farmMachine.color);
    }
}
