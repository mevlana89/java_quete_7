public class Hangar {
    public static void main(String[] args) {

        Car car = new Car("Car", 10) ;
        Boat boat = new Boat("Boat", 10) ;
        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
