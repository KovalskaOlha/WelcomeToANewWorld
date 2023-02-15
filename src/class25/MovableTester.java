package class25;

public class MovableTester {
    public static void main(String[] args) {

        washAble [] arr={new Inverter(),new Phone(),new SmartWatch()};
        for(washAble x:arr){
            x.wash();
        }
        Movable [] move={new Car(),new Dog()};
        for(Movable x:move){
            x.move();
        }
        Flyable []fly={new Car(),new Dog()};
        for(Flyable y:fly){
            y.fly();
        }
    }
}
