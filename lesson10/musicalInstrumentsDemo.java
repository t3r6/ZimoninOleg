package lesson10;

public class musicalInstrumentsDemo {
    public static void main(String[] args) {
        Guitar acousticGuitar = new Guitar(6);
        Guitar electricGuitar = new Guitar();
        Drum bigDrum = new Drum(22.5);
        Drum smallDrum =new Drum();
        Trumpet longTrumplet = new Trumpet(17.5);
        Trumpet shortTrumplet = new Trumpet();
        musicInstrument[] instruments = {acousticGuitar, bigDrum, longTrumplet, electricGuitar, smallDrum, shortTrumplet};
        for (musicInstrument instrument : instruments) {
            instrument.play();
        }
    }
}
