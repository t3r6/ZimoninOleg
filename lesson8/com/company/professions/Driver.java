package lesson8.com.company.professions;

public class Driver extends PersonFromCarStory {
    private int drivingExperience;

    public Driver(String fullName, int drivingExperience) {
        super(fullName);
        this.drivingExperience = drivingExperience;
    }

    public Driver(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
    public Driver(){

    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Driver driver = (Driver) o;

        return drivingExperience == driver.drivingExperience;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + drivingExperience;
        return result;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                "} " + super.toString();
    }
}
