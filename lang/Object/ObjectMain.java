package lang.Object;

public class ObjectMain {
    public static void main(String[] args){
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        String string = child.toString(); // 객체에 대한 정보를 반환
//        String equals = child.equals(); 객체의 같음을 비교
//        String getlass = child.getClass();  객체의 클래스 정보를 반환
        System.out.println("ObjectMain.main");
        System.out.println("string");
    }
}
