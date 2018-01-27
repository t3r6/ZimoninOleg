package lesson10.sessons;

public enum Sesson {
    WINTER(-25.6), SUMMER(45.5) {
        public String getDescription() {
            return "тёплое время года";
        }
    }, SPRING(23.3), AUTEMN(13.5);

    private double temp;

    public double getTemp() {
        return temp;
    }

    Sesson(double temp) {
        this.temp = temp;
    }

    public String getDescription() {
        return "холодное время года";
    }
}
