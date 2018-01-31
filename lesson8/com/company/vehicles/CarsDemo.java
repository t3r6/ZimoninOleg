package lesson8.com.company.vehicles;

import lesson8.com.company.details.Engine;
import lesson8.com.company.professions.Driver;

public class CarsDemo {
    public static void main(String[] args) {
        Engine myEngine = new Engine();
        Driver myDriver = new Driver();
        Cars myCar = new Cars("Mazda", "cargo", 100500, myDriver, myEngine);
        Lorry lorry = new Lorry("Reno", "lorry", 999999, myDriver, myEngine, 100500);
        SportCar sportCar = new SportCar("Ferrari", "superCar", 768, myDriver, myEngine, 369);
        lorry.printInfo();
        sportCar.printInfo();
        myCar.start();
        myCar.stop();
        myCar.turnLeft();
        myCar.turnRight();
        myCar.printInfo();
    }
}
