package lang.Object;


// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
// 즉 시스템 or 컴파일러에 의해 자동으로 수행되는 것을 의미
public class Parent {
    //public class Parent extends Object{ 묵시적으로 java가 처리
    public void parentMethod(){
        System.out.println("Parent.parentMethod"); // soutm 입력시 자동 구문 대체
    }
}
