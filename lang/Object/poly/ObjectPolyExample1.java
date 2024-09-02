package lang.Object.poly;

import java.util.function.DoubleFunction;

public class ObjectPolyExample1  {
    public static void main(String[] args){
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj){
//        obj.sound(); Object는 sound()가 없다. Car안에 있음.

//        객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog){
            dog.sound();
        }else if (obj instanceof Car car){
            car.move();
        }
    }
}
