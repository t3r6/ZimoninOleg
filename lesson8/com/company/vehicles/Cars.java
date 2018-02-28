package lesson8.com.company.vehicles;

import lesson8.com.company.details.Engine;
import lesson8.com.company.professions.Driver;

public class Cars {
    private String carBrand;
    private String carBodyType;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Cars(String carBrand, String carBodyType, int weight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carBodyType = carBodyType;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Cars() {

    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        this.carBodyType = carBodyType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cars cars = (Cars) o;

        if (weight != cars.weight) return false;
        if (carBrand != null ? !carBrand.equals(cars.carBrand) : cars.carBrand != null) return false;
        if (carBodyType != null ? !carBodyType.equals(cars.carBodyType) : cars.carBodyType != null) return false;
        if (driver != null ? !driver.equals(cars.driver) : cars.driver != null) return false;
        return engine != null ? engine.equals(cars.engine) : cars.engine == null;
    }

    @Override
    public int hashCode() {
        int result = carBrand != null ? carBrand.hashCode() : 0;
        result = 31 * result + (carBodyType != null ? carBodyType.hashCode() : 0);
        result = 31 * result + weight;
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carBrand='" + carBrand + '\'' +
                ", carBodyType='" + carBodyType + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Останавливаемся!");
    }

    public void turnRight() {
        System.out.println("Поворачиваем на право!");
    }

    public void turnLeft() {
        System.out.println("Поворачиваем на лево!");
    }

    public void printInfo() {
        System.out.println("Данные по автомобилю!");
        System.out.println("Марка машины: " + getCarBrand());
        System.out.println("Тип автомобиля: " + getCarBodyType());
        System.out.println("Вес: " + getWeight());
        System.out.println("Мощность двигателя: " + engine.getPower());
        System.out.println("Владелец: " + driver.getFullName());
        System.out.println("Стаж вождения: " + driver.getDrivingExperience());
    }
}
