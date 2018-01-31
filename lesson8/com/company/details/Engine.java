package lesson8.com.company.details;

public class Engine {
    private int power;
    private String carmaker;

    public Engine(int power, String carmaker) {
        this.power = power;
        this.carmaker = carmaker;
    }
    public Engine(){

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCarmaker() {
        return carmaker;
    }

    public void setCarmaker(String carmaker) {
        this.carmaker = carmaker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (power != engine.power) return false;
        return carmaker != null ? carmaker.equals(engine.carmaker) : engine.carmaker == null;
    }

    @Override
    public int hashCode() {
        int result = power;
        result = 31 * result + (carmaker != null ? carmaker.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", carmaker='" + carmaker + '\'' +
                '}';
    }
}
