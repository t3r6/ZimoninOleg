package lesson8.com.company.vehicles;

import lesson8.com.company.details.Engine;
import lesson8.com.company.professions.Driver;

public class SportCar extends Cars {
    private int speed;

    public SportCar(String carBrand, String carBodyType, int weight, Driver driver, Engine engine, int speed) {
        super(carBrand, carBodyType, weight, driver, engine);
        this.speed = speed;
    }

    public SportCar(int speed) {
        this.speed = speed;
    }

    public SportCar() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SportCar sportCar = (SportCar) o;

        return speed == sportCar.speed;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + speed;
        return result;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
