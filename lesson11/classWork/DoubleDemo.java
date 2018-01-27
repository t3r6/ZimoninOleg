package lesson11.classWork;

public class DoubleDemo {
    public static void main(String[] args) {
        double k = 2;
        Double d5 = new Double(k);
        Double mD = new Double(89);
        Double sd = new Double("53");
        Double d3 = Double.valueOf(563.3);
        Double d4 = Double.valueOf("96.6");
        double d6 = Double.parseDouble("96.6");
        String d7 = Double.toString(996.856);

        System.out.println(mD);
        System.out.println(sd);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);
        System.out.println(d3.byteValue());
        System.out.println(d3.shortValue());
        System.out.println(d3.intValue());
        System.out.println(d3.longValue());
        System.out.println(d3.floatValue());
        System.out.println(d3.doubleValue());
    }
}
