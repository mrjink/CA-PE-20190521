package p1_begin;

public class Car {
    double currentFuel;
    boolean hasStarted;

    public Car() {
        this.currentFuel = 0.0d;
        this.hasStarted = false;
    }

    public void fillFuelTank() {
        currentFuel = 50.0d;
    }

    public void addFuel(double fuel) {
        if (fuel >= 0.0d) {
            currentFuel = currentFuel + fuel;
        }
    }

    public void startCar() {
        hasStarted = true;
    }

    public void stopCar() {
        hasStarted = false;
    }

    public boolean isCarStarted() {
        return hasStarted;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.currentFuel);
        System.out.println(car2.currentFuel);

        car1.fillFuelTank();
        car2.addFuel(-30.0d);

        System.out.println(car1.currentFuel);
        System.out.println(car2.currentFuel);

        printRunningCar(null);
        printRunningCar(car1);
        printRunningCar(car2);

        car1.startCar();
        car1.stopCar();
        car1.startCar();

        printRunningCar(car1);
        printRunningCar(car2);

    }

    private static void printRunningCar(Car car) {
        if (car != null) {
            if (car.isCarStarted()) {
                System.out.println("Vroem");
            } else {
                System.out.println("...");
            }
        }
    }

}
