public class Car {
    int cadance;
    int speed;
    int gear;

    void changeCadance(int carCadance) {
        cadance = carCadance;
    }

    void speedUp(int carSpeed) {
        speed = carSpeed;
    }

    void changeGear(int carGear) {
        gear = carGear;
    }

    void printInfo() {
        System.out.println(
            "Candance Mobil : " + cadance + "\n" +
            "Kecepatan Mobil : " + speed + "Kmh" + "\n" +
            "Gear Mobil : " + gear
        );
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.changeCadance(50);
        car1.speedUp(20);
        car1.changeGear(2);
        car1.printInfo();

        car2.changeCadance(30);
        car2.speedUp(10);
        car2.changeGear(1);
        car2.printInfo();
    }
}
