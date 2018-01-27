package lesson10.instruments;

public class Trumpet implements MusicInstrument {
    private double trumpletLength;

    public Trumpet(double trumpletLength) {
        this.trumpletLength = trumpletLength;
    }

    public Trumpet() {

    }

    public double getTrumpletLength() {
        return trumpletLength;
    }

    public void setTrumpletLength(double trumpletLength) {
        this.trumpletLength = trumpletLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trumpet trumpet = (Trumpet) o;

        return Double.compare(trumpet.trumpletLength, trumpletLength) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(trumpletLength);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "trumpletLength=" + trumpletLength +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет гитара длиной " + getTrumpletLength());
    }
}
