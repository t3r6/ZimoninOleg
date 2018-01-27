package lesson10.clothes;

public enum SizeClothes {
    XXS(32) {
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    private int euroSize;

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

    SizeClothes(int euroSize) {
        this.euroSize = euroSize;
    }
}
