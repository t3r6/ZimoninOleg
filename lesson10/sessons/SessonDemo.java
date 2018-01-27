package lesson10.sessons;

public class SessonDemo {
    public static void main(String[] args) {
        Sesson myPerfectSesson = Sesson.SPRING;
        printSesson(myPerfectSesson);
        printAllValues();
    }

    public static void printSesson(Sesson mySesson) {
        switch (mySesson) {
            case WINTER:
                System.out.println("I like winter!" + mySesson.getTemp());
                break;
            case SPRING:
                System.out.println("I like spring! Temp is  " + mySesson.getTemp());
                break;
            case SUMMER:
                System.out.println("I like summer" + mySesson.getTemp());
                break;
            case AUTEMN:
                System.out.println("I like autemn" + mySesson.getTemp());
                break;
            default:
                System.out.println("Something wrong");
        }
    }

    public static void printAllValues() {
        Sesson[] sessons = Sesson.values();
        for (Sesson sesson : sessons) {
            System.out.println(sesson + " " + sesson.ordinal() + " " + sesson.getDescription());
        }
    }
}
