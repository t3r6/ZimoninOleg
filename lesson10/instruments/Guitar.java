package lesson10.instruments;

public class Guitar implements MusicInstrument {
    private int amountOfStrings;

    public Guitar(int amountOfStrings) {
        this.amountOfStrings = amountOfStrings;
    }

    public Guitar() {

    }

    public int getAmountOfStrings() {
        return amountOfStrings;
    }

    public void setAmountOfStrings(int amountOfStrings) {
        this.amountOfStrings = amountOfStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return amountOfStrings == guitar.amountOfStrings;
    }

    @Override
    public int hashCode() {
        return amountOfStrings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "amountOfStrings=" + amountOfStrings +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + getAmountOfStrings() + " струнами.");
    }
}
