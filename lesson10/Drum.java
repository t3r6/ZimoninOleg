package lesson10;

public class Drum  implements musicInstrument{
    private double diameter;

    public Drum(double diam) {
        this.diameter = diam;
    }
    public Drum(){

    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drum drum = (Drum) o;

        return Double.compare(drum.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(diameter);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Drum{" +
                "diameter=" + diameter +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет барабан диаметром " + getDiameter());
    }
}
