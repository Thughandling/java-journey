package lang.Object;

// 명시적으로 상속을 받을 경우, Object를 상속받지 않음
public class Child extends Parent{

    public void childMethod(){
        System.out.println("Child.childMethod");
    }

}
