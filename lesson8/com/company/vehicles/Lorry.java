package lesson8.com.company.vehicles;

import lesson8.com.company.details.Engine;
import lesson8.com.company.professions.Driver;

public class Lorry extends Cars {
    private int carrying;

    public Lorry(String carBrand, String carBodyType, int weight, Driver driver, Engine engine, int carrying) {
        super(carBrand, carBodyType, weight, driver, engine);
        this.carrying = carrying;
    }

    public Lorry(int carrying) {
        this.carrying = carrying;
    }

    public Lorry() {

    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Lorry lorry = (Lorry) o;

        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + carrying;
        return result;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                "} " + super.toString();
    }
}
