package lang.Object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString()출력 인스턴스 정보, 참조 값
        System.out.println(string);
        //object 출력
        System.out.println(object);
        
//        println 메서드가 결국엔 toString을 참조하여 반환.       
//        즉 객체의 정보를 알기 위해 toString 정의 보단, println내에 객체를 넣으면 객체의 정보를 알 수 있음
//        보통 toString을 재정의(오버라이딩)해서 보다 유용한 정보를 출력
    }
}
