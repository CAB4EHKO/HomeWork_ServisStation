public class Main {
    public static void main(String[] args) {

        Bicycle[] bicycles = {
                new Bicycle("Pinarello", 2),
                new Bicycle("Trek", 2)
        };

        Car[] cars = {
                new Car("Opel", 4),
                new Car("Audi", 4)
        };

        Truck[] trucks = {
                new Truck("Kamaz", 10),
                new Truck("Hovo", 12)
        };

        ServiceStation serviceStationForTruck = new ServiceStationForTruck();
        ServiceStation serviceStationForCar = new ServiceStationForCar();
        ServiceStation serviceStationForBicycle = new ServiceStationForBicycle();

        serviceStationForTruck.check(trucks[1]);
        System.out.println();

        serviceStationForCar.check(cars[1]);
        System.out.println();

        serviceStationForBicycle.check(bicycles[1]);
    }
}