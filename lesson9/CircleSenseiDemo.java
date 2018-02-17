package lesson9;

public class CircleSenseiDemo {
    public static void main(String[] args) {
        CircleSensei circleRound1 = new CircleSensei(1.23);
        CircleSensei circleRound2 = new CircleSensei(4.56);
        CircleSensei circleRound3 = new CircleSensei(7.89);
        circleRound1.circleContent(circleRound1.getRadius());
        circleRound1.lengthOfCircumferenceOfACircle(circleRound1.getRadius());
        circleRound2.circleContent(circleRound2.getRadius());
        circleRound2.lengthOfCircumferenceOfACircle(circleRound2.getRadius());
        circleRound3.circleContent(circleRound3.getRadius());
        circleRound3.lengthOfCircumferenceOfACircle(circleRound3.getRadius());
    }
}